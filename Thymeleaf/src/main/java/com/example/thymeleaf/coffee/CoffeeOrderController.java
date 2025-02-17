package com.example.thymeleaf.coffee;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.UUID;

@Controller
public class CoffeeOrderController {

    private final CoffeeOrderService coffeeOrderService;

    public CoffeeOrderController(CoffeeOrderService coffeeOrderService) {
        this.coffeeOrderService = coffeeOrderService;
    }

    @GetMapping("/order")
    public String showOrderForm(Model model) {
        CoffeeOrder coffeeOrder = new CoffeeOrder();
        coffeeOrder.addSize(CoffeeSize.TALL); // Tilføjet standard størrelse
        model.addAttribute("coffeeOrder", coffeeOrder);
        model.addAttribute("coffeeType", CoffeeType.values());
        model.addAttribute("milkTypes", MilkType.values());
        model.addAttribute("coffeeSize", CoffeeSize.values());
        return "order-form";
    }

    @PostMapping("/order")
    public String placeOrder(@ModelAttribute CoffeeOrder coffeeOrder) {
        if (coffeeOrder.getOrderId() == null) {
            coffeeOrderService.placeOrder(coffeeOrder);
        } else {
            coffeeOrderService.updateOrder(coffeeOrder);
        }
        return "redirect:/orders";
    }

    @GetMapping("/orders")
    public String showOrders(Model model) {
        model.addAttribute("orders", coffeeOrderService.getAllOrders());
        return "order-list";
    }

    @GetMapping("/order/edit/{id}")
    public String editOrder(@PathVariable UUID id, Model model) {
        CoffeeOrder coffeeOrder = coffeeOrderService.getOrderById(id);
        if (coffeeOrder == null) {
            throw new IllegalArgumentException("Invalid order ID");
        }

        model.addAttribute("coffeeOrder", coffeeOrder);
        model.addAttribute("coffeeTypes", CoffeeType.values());
        model.addAttribute("milkTypes", MilkType.values());
        model.addAttribute("coffeeSize", CoffeeSize.values());
        return "order-form";
    }
}

