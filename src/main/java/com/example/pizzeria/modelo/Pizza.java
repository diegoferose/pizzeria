package com.example.pizzeria.modelo;

import java.util.List;


public class Pizza {
    private Long id;
    private String name;
    private String description;
    private List<String> toppings;

    public Pizza(Long id, String name, String description, List<String> toppings) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.toppings = toppings;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }
}
