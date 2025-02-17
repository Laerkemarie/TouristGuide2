package com.example.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.DayOfWeek;
import java.time.LocalDate;

@Controller
public class FridayController {

    @GetMapping("/friday")
    public String isItFriday(Model model) {
        DayOfWeek today = LocalDate.now().getDayOfWeek();
        String weekday = today.name().toLowerCase();

        model.addAttribute("weekday", weekday);

        return "friday";
    }
}
