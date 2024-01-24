package pl.pjatk.demo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PizzaStorage {

    private List<Pizza> pizzaList;

    public PizzaStorage() {
        this.pizzaList = new ArrayList<>();
    }

    public void addPizza(Pizza pizza) {
        pizzaList.add(pizza);
    }

    public List<Pizza> getPizzaList() {
        return pizzaList;
    }
}
