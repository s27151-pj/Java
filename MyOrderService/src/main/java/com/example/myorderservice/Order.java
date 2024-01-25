package com.example.myorderservice;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
@Component
public class Order {
    int id = 0;
    private int orderId;
    private Customer customer;
    private String address;
    private Map<Product, Integer> orderedProducts;
    private OrderState orderState;

    public Order() {
        this.orderedProducts = new HashMap<>();
    }
    public void addProduct(Product product, int quantity) {
        if (orderedProducts.containsKey(product)) {
            int currentQuantity = orderedProducts.get(product);
            orderedProducts.put(product, currentQuantity + quantity);
        } else {
            orderedProducts.put(product, quantity);
        }
    }
    public void removeProduct(Product product, int quantity) {
        if (orderedProducts.containsKey(product)) {
            int currentQuantity = orderedProducts.get(product);
            if (currentQuantity <= quantity) {
                orderedProducts.remove(product);
            } else {
                orderedProducts.put(product, currentQuantity - quantity);
            }
        }
    }
    public Map<Product, Integer> getAllOrderedProducts() {
        return new HashMap<>(orderedProducts);
    }
    public void clear() {
        orderedProducts.clear();
    }

    public Order(int orderId, Customer customer, String address, Map<Product, Integer> orderedProducts, OrderState orderState) {
        this.orderId = orderId;
        this.customer = customer;
        this.address = address;
        this.orderedProducts = orderedProducts;
        this.orderState = orderState;
    }
    public Order(Customer customer, String address, Map<Product, Integer> orderedProducts, OrderState orderState) {
        id = id++;
        this.orderId = id;
        this.customer = customer;
        this.address = null;
        this.orderedProducts = orderedProducts;
        this.orderState = orderState;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public OrderState getOrderState() {
        return orderState;
    }

    public void setOrderState(OrderState orderState) {
        this.orderState = orderState;
    }
    public void clearData() {
        orderedProducts.clear();
    }
}
