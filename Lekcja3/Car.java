public class Car {
    private String brand;
    private String modell;
    private String vin;

    private final Car.Car_class Car_class;
    enum Car_class {
        PREMIUM, NORMAL, SUP_EXCLUSIVE
    }

    public Car(String brand, String modell, String vin, Car_class car_class) {
        this.brand = brand;
        this.modell = modell;
        this.vin = vin;
        this.Car_class = car_class;
    }

    public String getBrand() {
        return brand;
    }

    public String getModell() {
        return modell;
    }

    public String getVin() {
        return vin;
    }

    public Car_class getCar_class() {
        return Car_class;
    }

}
