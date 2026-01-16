package com.enterprise.orderapi.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OrderController {

    @GetMapping("/orders/{id}")
   public String getOrderById(@PathVariable int id) {
    return "Order details for order id: " + id;
}
}

