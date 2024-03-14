package com.demodemo.demodemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/fruit")
    public List<fruit> fruit() {
        List<fruit> fruits = List.of(
                new fruit("apple", 1, 200),
                new fruit("banana", 5, 99),
                new fruit("strawberry", 2, 400),
                new fruit("avocado", 3, 100),
                new fruit("orange", 4, 150));
        return fruits;
    }
}
