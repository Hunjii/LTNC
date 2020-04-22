/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.api;

import com.example.demo.model.Host;
import com.example.demo.model.ListHost;
import com.example.demo.service.HostService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author manh2198
 */

@RequestMapping("api/v1/hosts")
@RestController
public class HostController {
    private final HostService hostService;

    @Autowired
    public HostController(HostService hostService) {
        this.hostService = hostService;
    }

//    @Autowired
   //public RoomController() {}

    @PostMapping
    public Host addHost(@RequestBody Host host){
        hostService.addRoom(host);
        return host;
    }

    @GetMapping
    public ListHost getAllRooms(){
        List<Host> Hosts = hostService.getAllHost();
        ListHost listHost = new ListHost(Hosts.size(), Hosts );

        return listHost;
    }

    @GetMapping(path = "/{id}")
    public Optional<Host> getHost(@PathVariable("id") String id){ return hostService.getHost(id); }

    @DeleteMapping(path = "/{id}")
    public void deleteHost(@PathVariable("id") String id) { hostService.deleteHost(id); }

    @CrossOrigin
    @PutMapping(path = "/{id}")
    public Host updateHost(@PathVariable("id") String id, @RequestBody Host host){
        Optional<Host> HostUpdate = hostService.getHost(id);

        host.setId(HostUpdate.get().getId());
        hostService.updateHost(host);
        return host;
    }
}
