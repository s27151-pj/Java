package pl.pjatk.demo;

public class Order {

    private Pizza pizza;
    private Size size;
    private String customerName;

    public Order(Pizza pizza, Size size, String customerName) {
        this.pizza = pizza;
        this.size = size;
        this.customerName = customerName;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
