package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    private final  CarStorage carStorage;
    private final RentStorage rentStorage;

    public Main(CarStorage carStorage, RentStorage rentStorage){
        this.carStorage = carStorage;
        this.rentStorage = rentStorage;
        initProcess();
    }
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }
    public void  initProcess(){
        Car car1 = new Car("Audi", "A7", 324552, Type.Sedan);
        carStorage.addcar(car1);
    }
}
 