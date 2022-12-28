package com.knovacion.bookingmicroservice.repository;

import com.knovacion.bookingmicroservice.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
