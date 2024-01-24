package pl.pjatk.demo;

public class Pizza {
    private String name;
    private double basicPrice;

    public Pizza(String name, double price) {
        this.name = name;
        this.basicPrice = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public void setBasicPrice(double basicPrice) {
        this.basicPrice = basicPrice;
    }
}
