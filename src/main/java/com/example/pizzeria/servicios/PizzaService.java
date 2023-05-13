package com.example.pizzeria.servicios;

import com.example.pizzeria.modelo.Pizza;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class PizzaService {

    public List<Pizza> obtenerTodasLasPizzas(){
        List<Pizza> pizzas = new ArrayList<>();
        pizzas.add(new Pizza(1L, "Margarita", "Tomate y queso mozzarella", Arrays.asList("Tomate", "Mozzarella")));
        pizzas.add(new Pizza(2L, "Pepperoni", "Tomate, queso mozzarella y pepperoni", Arrays.asList("Tomate", "Mozzarella", "Pepperoni")));
        pizzas.add(new Pizza(3L, "Hawaiana", "Tomate, queso mozzarella, jamón y piña", Arrays.asList("Tomate", "Mozzarella", "Jamón", "Piña")));
        return pizzas;
    }
}
