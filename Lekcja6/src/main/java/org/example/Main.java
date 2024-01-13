package org.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;

@SpringBootApplication
public class Main {
    private final CarStorage carStorage;

    private final RentStorage rentStorage;

    public Main(CarStorage carStorage, RentStorage rentStorage) {
        this.carStorage = carStorage;
        this.rentStorage = rentStorage;
    }

    public static void Main(String[] args) {


        SpringApplication.run(Main.class,args);
        CarStorage magazyn = new CarStorage();

        System.out.println(magazyn.getCarList());


    }
}
