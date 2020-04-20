package com.example.demo.dao;

import com.example.demo.model.Order;

import java.util.List;
import java.util.Optional;

public interface OrderDao {
    void insertOrder(Order oder);

    List<Order> SelectAllOrder();

    Optional<Order> getOrder(String id);

    void deleteOrder(String id);

    void updateOrder(Order room);
}
