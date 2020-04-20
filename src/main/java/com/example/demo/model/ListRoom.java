package com.example.demo.model;

import java.util.List;

public class ListRoom {
    private int length;
    private List<Room> listRoom;

    public ListRoom( int length, List<Room> listRoom) {
        this.length = length;
        this.listRoom = listRoom;
    }

    public ListRoom() {}

    public List<Room> getListRoom() {
        return listRoom;
    }

    public void setListRoom(List<Room> listRoom) {
        this.listRoom = listRoom;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
