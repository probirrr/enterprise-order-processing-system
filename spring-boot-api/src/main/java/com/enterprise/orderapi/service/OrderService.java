package com.enterprise.orderapi.service;

import com.enterprise.orderapi.dto.OrderDTO;
import java.util.List;

public interface OrderService {
    void processBatchOrders(List<OrderDTO> orders);
}
