package org.example;

import java.util.ArrayList;
import java.util.List;

public class CarStorage {
    private static CarStorage instance;
    private List<Car> cars = new ArrayList<>();

    private CarStorage(){
//        cars.add(new Car("WW", "Golf", "4",Type.PREMIUM));
//        cars.add(new Car("BMW", "X", "1",Type.STANDARD));
//        cars.add(new Car("FORD", "FOCUS", "4",Type.ECONOMY));
    }
    public static CarStorage getInstance() {
        if (instance == null) {
            instance = new CarStorage();
        }
        return instance;
    }
    public List<Car> getCars() {
        return cars;
    }

    public void addCar(Car car) {
        cars.add(car);
    }
}
