package com.example.demo.service;

import com.example.demo.dao.OrderDao;
import com.example.demo.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    private final OrderDao orderDao;

    @Autowired
    public OrderService(@Qualifier("OrderDao") OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public void addOrder(Order order){
        orderDao.insertOrder(order);
    }

    public List<Order> getAllOrder(){
        return orderDao.SelectAllOrder();
    }

    public Optional<Order> getOrder(String id) { return orderDao.getOrder(id); }

    public void deleteOrder(String id) { orderDao.deleteOrder(id); }

    public void updateOrder(Order order){
        orderDao.updateOrder(order);
    }
}
