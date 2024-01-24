package com.example.s27151orderservice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class OrderServiceITest {

    @Autowired
    private OrderService orderService;

    @Test
    void createOrder_ShouldCreateAndStoreOrder() {
        // Arrange
        Long orderId = 1L;
        String orderAddress = "Test Address";

        // Act
        Order order = orderService.createOrder(orderId, orderAddress);

        // Assert
        assertThat(order.getOrderId()).isEqualTo(orderId);
        assertThat(order.getAddress()).isEqualTo(orderAddress);
        assertThat(order.getState()).isEqualTo(State.NOWE);
        assertThat(order.getProducts()).isEmpty();
    }
}
