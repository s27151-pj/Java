package pl.pjatk.demo;

import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class PizzaService {

    private final PizzaStorage pizzaStorage;

    public PizzaService(PizzaStorage pizzaStorage) {
        this.pizzaStorage = pizzaStorage;
    }

    public double checkPizzaPrice(String name, Size size) {
        Pizza pizza = findPizzaByName(name);
        return pizza.getBasicPrice() * size.getMultiplier();
    }

    public Pizza findPizzaByName(String name) {
        Pizza pizza = null;
        for (Pizza p : pizzaStorage.getPizzaList()) {
            if (p.getName().equals(name)) {
                pizza = p;
                break;
            }
        }
        if (pizza == null) {
            throw new NoSuchElementException();
        } else {
            return pizza;
        }
    }
}
