package com.enterprise.orderapi.service;

import com.enterprise.orderapi.dto.OrderDTO;
import com.enterprise.orderapi.entity.OrderEntity;
import com.enterprise.orderapi.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public void processBatchOrders(List<OrderDTO> orders) {
        for (OrderDTO dto : orders) {
            OrderEntity entity = new OrderEntity();
            entity.setOrderId(dto.getOrderId());
            entity.setOrderCode(dto.getOrderCode());
            entity.setOrderDate(dto.getOrderDate());
            entity.setAmount(dto.getAmount());
            entity.setStatus(dto.getStatus());

            orderRepository.save(entity);

            System.out.println("Saved order to DB: " + entity.getOrderId());
        }
    }
}

