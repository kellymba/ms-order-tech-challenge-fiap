package com.fiap.ms_order.dto;

public class CustomerDto {
    private int customerId;
    private String customerName;
    private String customerEmail;
    private String customerDocument;

    public int getCustomerId() {return customerId;}
    public void setCustomerId(int customerId) {this.customerId = customerId;}

    public String getCustomerName() {return customerName;}
    public void setCustomerName(String customerName) {this.customerName = customerName;}

    public String getCustomerEmail() {return customerEmail;}
    public void setCustomerEmail(String customerEmail) {this.customerEmail = customerEmail;}

    public String getCustomerDocument() {return customerDocument;}
    public void setCustomerDocument(String customerDocument) {this.customerDocument = customerDocument;}
}
