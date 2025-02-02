package com.fiap.ms_order.dto;

import java.util.List;

public class OrderDto {
    private int orderId;
    private List<ProductDto> products;
    private CustomerDto customer;
    private int orderTotal;
    private String orderStatus;

    public int getOrderId() {return orderId;}
    public void setOrderId(int orderId) {this.orderId = orderId;}

    public List<ProductDto> getProducts() {return products;}
    public void setProducts(List<ProductDto> products) {this.products = products;}

    public CustomerDto getCustomer() {return customer;}
    public void setCustomer(CustomerDto customer) {this.customer = customer;}

    public int getOrderTotal() {return orderTotal;}
    public void setOrderTotal(int orderTotal) {this.orderTotal = orderTotal;}

    public String getOrderStatus() {return orderStatus;}
    public void setOrderStatus(String orderStatus) {this.orderStatus = orderStatus;}

}
