package com.example.demo.model;

import java.util.Date;

public class ListOrders {
    private String id;
    private Date date;
    private Room room;

    public ListOrders(String id, Date date, Room room) {
        this.id = id;
        this.date = date;
        this.room = room;
    }

    public ListOrders() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
