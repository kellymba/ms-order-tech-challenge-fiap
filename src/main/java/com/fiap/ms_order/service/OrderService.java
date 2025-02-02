package com.fiap.ms_order.service;

import com.fiap.ms_order.dto.CustomerDto;
import com.fiap.ms_order.dto.OrderDto;
import com.fiap.ms_order.dto.ProductDto;
import com.fiap.ms_order.repository.OrderRepository;

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

        if(!order.getProducts().isEmpty()) {
            for (ProductDto product : order.getProducts()) {
                hasProduct = orderRepository.getProductById(product.getProductId());

                if (hasProduct) {
                    success = orderRepository.insertOrder(order);
                }
            }

            hasCustomer = orderRepository.getCustomerById(order.getCustomer().getCustomerId());

            if(hasCustomer) {
                //login customer
            }
        }

        return success;
    }
}
