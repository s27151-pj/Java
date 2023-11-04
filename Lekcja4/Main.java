package org.example;

public class Main {
    public static void main(String[] args){

        Car Car1 = new Car("WW", "Golf", "4",Type.PREMIUM);
        Car Car2 = new Car("BMW", "X", "1",Type.STANDARD);
        Car Car3 = new Car("FORD", "FOCUS", "4",Type.ECONOMY);

        RentalService rentalService = new RentalService();
        rentalService.rent(userId, carVin);
        rentalService.isAvalible(car);

    }
}

