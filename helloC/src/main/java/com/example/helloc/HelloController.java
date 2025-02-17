package com.example.helloc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("")
    public String sayHello(@RequestParam(value = "Myname", defaultValue = "World")String name) {
        return "Hello " + name;
    }
}
