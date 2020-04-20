package com.example.demo.dao;

import com.example.demo.model.Room;

import java.util.List;
import java.util.Optional;

public interface RoomDao {
    void insertRoom(Room room);

    List<Room> SelectAllRoom();

    Optional<Room> getRoom(String id);

    void deleteRoom(String id);

    void updateRoom(Room room);
}
