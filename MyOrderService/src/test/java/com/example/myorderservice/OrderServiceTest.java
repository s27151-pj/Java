package com.example.myorderservice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OrderServiceTest {

    @Autowired
    private OrderService orderService;
    @Autowired
    private CustomerStorage customerStorage;
    @Autowired
    private OrderStorage orderStorage;
    @Autowired
    private Order order;

    @BeforeEach
    void clearData() {
        customerStorage.clearData();
        orderStorage.clearData();
    }

    @Test
    void orderPlacing(){
        Customer customer1 = new Customer(1, "Ronald");
        Product product1 = new Product(1,"Szczotka","Do Szczotkowania",12.0);
        Product product2 = new Product(2,"Pasta","Do utrzymania świeżoci jamy ustnej",21.0);

        customerStorage.addCustomer(customer1);

        HashMap<Product, Integer> orderedProducts = new HashMap<Product, Integer>();
        orderedProducts.put(product1, 1);
        orderedProducts.put(product1, 3);
        orderedProducts.put(product2, 2);

        String result = orderService.orderPlacing(1, "Kokoszki wielkie 3/2",orderedProducts);
        assertThat(result).isEqualTo("Order IN_IMPLEMENTATION");
    }
    @Test
    void checkOrderStatus() {
        Customer customer1 = new Customer(1, "Ronald");

        Product product1 = new Product(1,"Szczotka","Do Szczotkowania",12.0);
        Product product2 = new Product(2,"Pasta","Do utrzymania świeżoci jamy ustnej",21.0);

        HashMap<Product, Integer> orderedProducts = new HashMap<Product, Integer>();
        orderedProducts.put(product1, 1);
        orderedProducts.put(product2, 2);

        Order order1 = new Order(1, customer1,"Filotowo 2", orderedProducts, OrderState.CANCELLED);
        orderStorage.addOrder(order1);
        String result = orderService.checkOrderStatus(1);
        assertThat(result).isEqualTo("State: CANCELLED, AllOrderedProducts: " + order1.getAllOrderedProducts());
    }

    @Test
    void orderCancellation() {
        Customer customer1 = new Customer(1, "Ronald");
        customerStorage.addCustomer(customer1);

        Product product1 = new Product(1,"Szczotka","Do Szczotkowania",12.0);
        Product product2 = new Product(2,"Pasta","Do utrzymania świeżoci jamy ustnej",21.0);

        HashMap<Product, Integer> orderedProducts = new HashMap<Product, Integer>();
        orderedProducts.put(product1, 1);
        orderedProducts.put(product2, 2);


        Order order1 = new Order(1, customer1,"Filotowo 2", orderedProducts, OrderState.NEW);
        orderStorage.addOrder(order1);

        Order result = orderService.orderCancellation(1);
        assertThat(result).isEqualTo(order1);
    }

    @Test
    void orderDelivered() {
        Customer customer1 = new Customer(1, "Ronald");
        customerStorage.addCustomer(customer1);

        Product product1 = new Product(1,"Szczotka","Do Szczotkowania",12.0);
        Product product2 = new Product(2,"Pasta","Do utrzymania świeżoci jamy ustnej",21.0);

        HashMap<Product, Integer> orderedProducts = new HashMap<Product, Integer>();
        orderedProducts.put(product1, 1);
        orderedProducts.put(product2, 2);


        Order order1 = new Order(1, customer1,"Filotowo 2", orderedProducts, OrderState.NEW);
        orderStorage.addOrder(order1);

        Order result = orderService.orderDelivered(1);
        assertThat(result).isEqualTo(order1);
    }
}