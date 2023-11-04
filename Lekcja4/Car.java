package org.example;

public class Car {
    private String brand;
    private String modell;
    private String vin;
    private Type carType;
    private boolean rented;

    public Car(String brand, String modell, String vin, Type carType) {
        this.brand = brand;
        this.modell = modell;
        this.vin = vin;
        this.carType = carType;
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

    public Type getCar_class() {
        return carType;
    }

    public boolean isRented(boolean b) {
        return !rented;
    }
    public void setRented(boolean rented) {
        this.rented = rented;
    }

}
