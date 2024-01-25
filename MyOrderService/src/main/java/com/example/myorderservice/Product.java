package com.example.myorderservice;

public class Product {
    private int productId;
    private String productName;
    private String productDescription;
    private double productBasicPrice;

    public Product(int productId, String productName, String productDescription, double productBasicPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productDescription = productDescription;
        this.productBasicPrice = productBasicPrice;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getProductBasicPrice() {
        return productBasicPrice;
    }

    public void setProductBasicPrice(double productBasicPrice) {
        this.productBasicPrice = productBasicPrice;
    }
}
