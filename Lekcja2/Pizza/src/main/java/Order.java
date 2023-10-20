import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Order {
    private int id;
    private List<Pizza> PizzaList;

    public Order(int id, List<Pizza> pizzaList) {
        this.id = id;
        this.PizzaList = pizzaList;
    }

    public double getOrderValue() {
        return PizzaList.stream()
                .mapToDouble(Pizza::getPrice)
                .sum();
    }

    public int getId() {
        return id;
    }

    public List<Pizza> getPizzaList() {
        return PizzaList;
    }
}