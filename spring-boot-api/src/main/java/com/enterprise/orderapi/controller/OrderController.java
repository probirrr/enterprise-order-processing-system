package com.enterprise.orderapi.controller;

import com.enterprise.orderapi.dto.OrderDTO;
import com.enterprise.orderapi.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/orders")
    public String getOrders() {
        return "Order list fetched successfully";
    }

    @GetMapping("/orders/{id}")
    public String getOrderById(@PathVariable int id) {
        return "Order details for order id: " + id;
    }

    @PostMapping("/batch/orders")
    public String loadBatchOrders(@RequestBody List<OrderDTO> orders) {
        orderService.processBatchOrders(orders);
        return "Batch orders processed successfully";

    }
   

}

