package com.enterprise.orderapi.repository;

import com.enterprise.orderapi.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderEntity, String> {
}

