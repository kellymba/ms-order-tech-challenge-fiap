package com.fiap.ms_order.repository;

import com.fiap.ms_order.dto.OrderDto;

import java.util.ArrayList;
import java.util.List;

public class OrderRepository {

    public List<OrderDto> getAllOrders(){
        String sql = "select * from orders";

        List<OrderDto> orders = new ArrayList<>();

        return orders;
    }

    public boolean getProductById(int productId){
        String sql = "select * from products";

        boolean response =  false;

        return response;
    }

    public boolean getCustomerById(int customerId){
        String sql = "select * from customers";

        boolean response =  false;

        return response;
    }

    public boolean insertOrder(OrderDto order){
        String sql = "insert into orders values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        int response = 0;

        return response == 0 ? true : false;
    }
}
