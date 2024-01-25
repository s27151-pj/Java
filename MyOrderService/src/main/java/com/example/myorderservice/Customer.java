package com.example.myorderservice;

public class Customer {
    private int customerId;
    private String Name;

    public Customer(int customerId, String name) {
        this.customerId = customerId;
        Name = name;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
