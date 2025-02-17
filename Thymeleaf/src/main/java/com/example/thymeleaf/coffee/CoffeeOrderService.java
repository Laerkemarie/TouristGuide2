package com.example.thymeleaf.coffee;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CoffeeOrderService {

    private final List<CoffeeOrder> orders = new ArrayList<>();

    public void placeOrder(CoffeeOrder coffeeOrder) {
        coffeeOrder.setOrderId(UUID.randomUUID());
        orders.add(coffeeOrder);
    }

    public void updateOrder(CoffeeOrder coffeeOrder) {
        Optional<CoffeeOrder> existingOrder = orders.stream()
                .filter(order -> order.getOrderId().equals(coffeeOrder.getOrderId()))
                .findFirst();

        if (existingOrder.isPresent()) {
            CoffeeOrder orderToUpdate = existingOrder.get();
            orderToUpdate.setCoffeeType(coffeeOrder.getCoffeeType());
            orderToUpdate.setMilkType(coffeeOrder.getMilkType());
            orderToUpdate.getSizes().clear(); // Fjerner eksisterende størrelser før opdatering
            orderToUpdate.getSizes().addAll(coffeeOrder.getSizes()); // Tilføjer de nye størrelser
        }
    }

    public List<CoffeeOrder> getAllOrders() {
        return orders;
    }

    public CoffeeOrder getOrderById(UUID id) {
        return orders.stream()
                .filter(order -> order.getOrderId().equals(id))
                .findFirst()
                .orElse(null);
    }
}

