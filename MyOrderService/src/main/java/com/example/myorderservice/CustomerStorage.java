package com.example.myorderservice;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class CustomerStorage {
    private List<Customer> customerList;

    public CustomerStorage() {
        this.customerList = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customerList.add(customer);
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }
    public void clearData() {
        customerList.clear();
    }
}
