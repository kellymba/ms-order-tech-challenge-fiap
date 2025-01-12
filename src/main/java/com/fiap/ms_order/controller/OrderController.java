package com.fiap.ms_order.controller;

import com.fiap.ms_order.dto.OrderDto;
import com.fiap.ms_order.repository.OrderRepository;
import com.fiap.ms_order.service.OrderService;
import org.springframework.core.annotation.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class OrderController {

    private OrderService orderService;

    @GetMapping("/all-orders")
    public ResponseEntity<?> getAllOrders() {
        List<OrderDto> response = orderService.findAllOrders();

        return ResponseEntity.ok(response);
    }

    @PostMapping("/create-order")
    public ResponseEntity<?> createOrder(@RequestBody OrderDto request) {
        boolean response = orderService.validateToCreateOrder(request);

        return ResponseEntity.ok(response);
    }
}
