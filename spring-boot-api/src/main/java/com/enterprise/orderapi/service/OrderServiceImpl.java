package com.enterprise.orderapi.service;

import com.enterprise.orderapi.dto.OrderDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Override
    public void processBatchOrders(List<OrderDTO> orders) {
        for (OrderDTO order : orders) {
            System.out.println("Processing order: " + order.getOrderId() +
                    " Status: " + order.getStatus());
        }
    }
}
