public class Pizza {
    private final Pizza.Size Size;

    enum Size {
        SMALL, MEDIUM, LARGE, EXTRALARGE
    }
    private double price;
    private String name;

    public Pizza(Size size, String name, double price) {
        this.Size = size;
        this.name = name;
        this.price = price;
    }

    public Size getSize() {
        return Size;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}