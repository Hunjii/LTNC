package com.example.demo.dao;

import com.example.demo.model.Order;
import com.example.demo.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("OrderDao")
public class OrderDataAccessService implements OrderDao {
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void insertOrder(Order order) {
        orderRepository.insert(order);
    }

    @Override
    public List<Order> SelectAllOrder() {
        return orderRepository.findAll();
    }

    @Override
    public Optional<Order> getOrder(String id) {
        return orderRepository.findById(id);
    }

    @Override
    public void deleteOrder(String id) {
        orderRepository.deleteById(id);
    }

    @Override
    public void updateOrder(Order order) {
        orderRepository.save(order);
    }
}
