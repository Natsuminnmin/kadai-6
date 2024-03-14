package com.demodemo.demodemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @GetMapping("/fruits")
    public List<Fruit> fruit() {
        List<Fruit> fruits = List.of(
                new Fruit("apple", 1, 200),
                new Fruit("banana", 5, 99),
                new Fruit("strawberry", 2, 400),
                new Fruit("avocado", 3, 100),
                new Fruit("orange", 4, 150));
        return fruits;
    }
}
