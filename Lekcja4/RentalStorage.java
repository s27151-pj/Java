package org.example;

import java.util.ArrayList;
import java.util.List;

public class RentalStorage {
    private static RentalStorage instance;
    private List<Rental> rentals = new ArrayList<>();

    private RentalStorage(){

    }
    public static RentalStorage getInstance() {
        if (instance == null) {
            instance = new RentalStorage();
        }
        return instance;
    }
    public List<Rental> getRentals() {
        return rentals;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }


}
