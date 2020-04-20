package com.example.demo.api;

import com.example.demo.model.ListRoom;
import com.example.demo.model.Room;
import com.example.demo.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("api/v1/rooms")
@RestController
public class RoomController {
    private final RoomService roomService;

    @Autowired
    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

//    @Autowired
   //public RoomController() {}

    @PostMapping
    public Room addRoom(@RequestBody Room room){
        roomService.addRoom(room);
        return room;
    }

    @GetMapping
    public ListRoom getAllRooms(){
        List<Room> Rooms = roomService.getAllRoom();
        ListRoom ListRoom = new ListRoom(Rooms.size(), Rooms );

        return  ListRoom;
    }

    @GetMapping(path = "/{id}")
    public Optional<Room> getRoom(@PathVariable("id") String id){ return roomService.getRoom(id); }

    @DeleteMapping(path = "/{id}")
    public void deleteRoom(@PathVariable("id") String id) { roomService.deleteRoom(id); }

    @CrossOrigin
    @PutMapping(path = "/{id}")
    public Room updateRoom(@PathVariable("id") String id, @RequestBody Room room){
        Optional<Room> RoomUpdate = roomService.getRoom(id);

        room.setId(RoomUpdate.get().getId());
        roomService.updateRoom(room);
        return room;
    }
}
