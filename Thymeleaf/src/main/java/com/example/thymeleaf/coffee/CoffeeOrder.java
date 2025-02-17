package com.example.thymeleaf.coffee;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class CoffeeOrder {
    private CoffeeType coffeeType;
    private MilkType milkType;
    private Set<CoffeeSize> sizes = new HashSet<>();
    private UUID orderId;

    public CoffeeOrder(CoffeeType coffeeType, MilkType milkType, Set<CoffeeSize> sizes, UUID orderId) {
        this.coffeeType = coffeeType;
        this.milkType = milkType;
        this.sizes = sizes;
        this.orderId = orderId;
    }

    public CoffeeOrder() {
    }

    public CoffeeType getCoffeeType() {
        return coffeeType;
    }

    public void setCoffeeType(CoffeeType coffeeType) {
        this.coffeeType = coffeeType;
    }

    public MilkType getMilkType() {
        return milkType;
    }

    public void setMilkType(MilkType milkType) {
        this.milkType = milkType;
    }

    public Set<CoffeeSize> getSizes() {
        return sizes;
    }

    public void setSizes(Set<CoffeeSize> sizes) {
        this.sizes = sizes;
    }

    public void addSize(CoffeeSize size) {
        this.sizes.add(size);
    }

    public UUID getOrderId() {
        return orderId;
    }

    public void setOrderId(UUID orderId) {
        this.orderId = orderId;
    }
}


