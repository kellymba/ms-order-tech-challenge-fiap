package com.fiap.ms_order.repository;

import com.fiap.ms_order.dto.OrderDto;

import java.util.ArrayList;
import java.util.List;

public class OrderRepository {

    public List<OrderDto> getAllOrders(){
        List<OrderDto> orders = new ArrayList<>();

        String sql = "select * from orders";

        return orders;
    }
}
