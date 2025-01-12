package com.fiap.ms_order.service;

import com.fiap.ms_order.dto.OrderDto;
import com.fiap.ms_order.repository.OrderRepository;
import org.springframework.core.annotation.Order;

import java.util.List;

public class OrderService {

    private OrderRepository orderRepository;

    public List<OrderDto> findAllOrders() {
        return orderRepository.getAllOrders();
    }

    public boolean validateToCreateOrder(OrderDto order) {
        boolean hasProduct;
        boolean hasCustomer;
        boolean success = false;

        hasProduct = orderRepository.getProductById(1);
        hasCustomer = orderRepository.getCustomerById(1);

        if(hasProduct && hasCustomer) {
            success = orderRepository.insertOrder(order);
        }

        return success;
    }
}
