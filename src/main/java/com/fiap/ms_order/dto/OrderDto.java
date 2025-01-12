package com.fiap.ms_order.dto;

import java.util.List;

public class OrderDto {
    private int orderId;
    private List<ProductDto> products;
    private List<CustomerDto> customer;
    private int orderTotal;
    private String orderStatus;
}
