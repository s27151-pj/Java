import java.util.Collections;
import java.util.List;

import static javax.swing.text.StyleConstants.Size;

public class Main {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza(Pizza.Size.SMALL, "COC" , 10.3);
        Pizza pizza2 = new Pizza(Pizza.Size.LARGE, "Salami" , 19.1);


        Order Order = new Order(1, List.of(pizza1, pizza2));

        System.out.println(Order);

    }
}