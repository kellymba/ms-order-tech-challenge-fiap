package com.fiap.ms_order.dto;

public class ProductDto {
    private int productId;
    private String productName;
    private int productPrice;
    private int productQuantity;
    private String productDescription;
    private String productCategory;

    public int getProductId() {return productId;}
    public void setProductId(int productId) {this.productId = productId;}

    public String getProductName() {return productName;}
    public void setProductName(String productName) {this.productName = productName;}

    public int getProductPrice() {return productPrice;}
    public void setProductPrice(int productPrice) {this.productPrice = productPrice;}

    public int getProductQuantity() {return productQuantity;}
    public void setProductQuantity(int productQuantity) {this.productQuantity = productQuantity;}

    public String getProductDescription() {return productDescription;}
    public void setProductDescription(String productDescription) {this.productDescription = productDescription;}

    public String getProductCategory() {return productCategory;}
    public void setProductCategory(String productCategory) {this.productCategory = productCategory;}
}
