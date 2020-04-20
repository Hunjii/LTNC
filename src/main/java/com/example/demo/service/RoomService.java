package com.example.demo.service;

import com.example.demo.dao.RoomDao;
import com.example.demo.model.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomService {
    private final RoomDao roomDao;

    @Autowired
    public RoomService(@Qualifier("Dao") RoomDao roomDao) {
        this.roomDao = roomDao;
    }

    public void addRoom(Room room){
        roomDao.insertRoom(room);
    }

    public List<Room> getAllRoom(){
        return roomDao.SelectAllRoom();
    }

    public Optional<Room> getRoom(String id) { return roomDao.getRoom(id); }

    public void deleteRoom(String id) { roomDao.deleteRoom(id); }

    public void updateRoom(Room room){
        roomDao.updateRoom(room);
    }
}
