package com.example.demo.api;


import com.example.demo.model.ListOrders;
import com.example.demo.model.ListRoom;
import com.example.demo.model.Order;
import com.example.demo.model.Room;
import com.example.demo.service.OrderService;
import com.example.demo.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RequestMapping("api/v1/orders")
@RestController
public class OrderController {
    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public Order addOrder(@RequestBody Order order){
        order.setDate(LocalDate.now().toString());
        orderService.addOrder(order);
        return order;
    }

    @GetMapping
    public List<Order> getAllOrders(){
        return  orderService.getAllOrder();
    }

    @GetMapping(path = "/{id}")
    public Optional<Order> getOder(@PathVariable("id") String id){ return orderService.getOrder(id); }

    @DeleteMapping(path = "/{id}")
    public void deleteOrder(@PathVariable("id") String id) { orderService.deleteOrder(id); }

    @CrossOrigin
    @PutMapping(path = "/{id}")
    public Order updateOrder(@PathVariable("id") String id, @RequestBody Order order){
        Optional<Order> OrderUpdate = orderService.getOrder(id);

        order.setId(OrderUpdate.get().getId());
        orderService.updateOrder(order);
        return order;
    }
}
