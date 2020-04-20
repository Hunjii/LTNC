package com.example.demo.dao;

import com.example.demo.model.Room;
import com.example.demo.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository("Dao")
public class FakePersonDataAccessService implements RoomDao {
    @Autowired
    private RoomRepository roomRepository;

    @Override
    public void insertRoom(Room room) {
        roomRepository.insert(room);
    }

    @Override
    public List<Room> SelectAllRoom() {
        return roomRepository.findAll();
    }

    @Override
    public Optional<Room> getRoom(String id) {
        return roomRepository.findById(id);
    }

    @Override
    public void deleteRoom(String id) {
        roomRepository.deleteById(id);
    }

    @Override
    public void updateRoom(Room room) {
        roomRepository.save(room);
    }


}
