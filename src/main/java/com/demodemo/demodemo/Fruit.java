package com.demodemo.demodemo;

public class Fruit {

    private String name;

    private int ranking;

    private int price;

    public Fruit(String name, int ranking, int price) {
        this.name = name;
        this.ranking = ranking;
        this.price = price;


    }

    public String getName() {
        return name;
    }

    public int getRanking() {
        return ranking;
    }

    public int getPrice() {
        return price;
    }
}
