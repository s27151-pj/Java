package com.example.myorderservice;

import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.NoSuchElementException;
@Service
public class OrderService {
    private final OrderStorage orderStorage;

    private final CustomerStorage customerStorage;

    public OrderService(OrderStorage orderStorage, CustomerStorage customerStorage) {
        this.orderStorage = orderStorage;
        this.customerStorage = customerStorage;
    }

    public String orderPlacing(int customerId, String orderAddress, Map<Product, Integer> orderedProducts) {
        Customer customer = findCustomerById(customerId);
        Order order = new Order(customer, orderAddress, orderedProducts, OrderState.IN_IMPLEMENTATION);
        orderStorage.addOrder(order);
        return "Order IN_IMPLEMENTATION";
    }
    public String checkOrderStatus(int orderId) {
        Order order = findOrderById(orderId);
        return "State: " + order.getOrderState() + ", AllOrderedProducts: " + order.getAllOrderedProducts();
    }
    public Order orderCancellation(int orderId){
        Order order = findOrderById(orderId);
        order.setOrderState(OrderState.CANCELLED);
        return order;
    }
    public Order orderDelivered(int orderId){
        Order order = findOrderById(orderId);
        order.setOrderState(OrderState.DELIVERED);
        return order;
    }
    public Customer findCustomerById(int customerId){
        Customer customer = null;
        for (Customer c : customerStorage.getCustomerList()) {
            if (c.getCustomerId() == (customerId)) {
                customer = c;
                break;
            }
        }
        if (customer == null) {
            throw new NoSuchElementException();
        } else {
            return customer;
        }
    }
    public Order findOrderById(int orderId){
        Order order = null;
        for (Order o : orderStorage.getOrderList()) {
            if (o.getOrderId() == (orderId)) {
                order = o;
                break;
            }
        }
        if (order == null) {
            throw new NoSuchElementException();
        } else {
            return order;
        }
    }

}
