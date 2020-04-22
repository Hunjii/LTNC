/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import com.example.demo.dao.HostDao;
import com.example.demo.model.Host;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


/**
 *
 * @author manh2198
 */
@Service
public class HostService {
    private final HostDao hostDao;
    @Autowired
    public HostService(@Qualifier("Dao") HostDao hostDao) {
        this.hostDao = hostDao;
    }

    public void addRoom(Host host){
        hostDao.insertHost(host);
    }

    public List<Host> getAllHost(){
        return hostDao.selectAllHost();
    }

    public Optional<Host> getHost(String id) { return hostDao.getHost(id); }

    public void deleteHost(String id) { hostDao.deleteHost(id); }

    public void updateHost(Host host){
        hostDao.updateHost(host);
    }
}
