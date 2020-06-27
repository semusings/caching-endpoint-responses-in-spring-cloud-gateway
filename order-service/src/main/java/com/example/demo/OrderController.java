package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

record Order(@JsonProperty("item")String item,
             @JsonProperty("quantity")Integer quantity) {

    public Order {
        if (quantity < 1) {
            throw new IllegalArgumentException("Quantity should be positive number.");
        }
    }
}

@RestController
public class OrderController {
    private final List<Order> orders = new ArrayList<>();

    @PostMapping("/orders")
    public Order create(@RequestBody Order request) {
        this.orders.add(request);
        return this.orders.get(this.orders.size() - 1);
    }

    @GetMapping("/orders")
    public List<Order> findAll() {
        return this.orders;
    }
}
