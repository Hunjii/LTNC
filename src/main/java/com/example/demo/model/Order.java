package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "oders")
public class Order {
    @Id
    private String id;
    private Host host;
    private String date;
    private Room room;
    private Integer status;

    public Order() {
    }

    public Order(String id, Host host, String date, Room room, Integer status) {
        this.id = id;
        this.host = host;
        this.date = date;
        this.room = room;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Host getHost() {
        return host;
    }

//    public void setHost(Host host) {
//        this.host = host;
//    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Room getRoom() {
        return room;
    }

//    public void setRoom(Room room) {
//        this.room = room;
//    }

    public Integer getStatus() {
        return status;
    }

//    public void setStatus(Integer status) {
//        this.status = status;
//    }
}
