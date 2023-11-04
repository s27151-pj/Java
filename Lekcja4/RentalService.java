package org.example;

import java.time.LocalDate;
import java.util.Optional;

public class RentalService {
    private final CarStorage carStorage;

    private final RentalStorage rentalStorage;

    public RentalService(CarStorage carStorage, RentalStorage rentalStorage) {
        this.carStorage = carStorage;
        this.rentalStorage = rentalStorage;

    }
    public Rental rent(int userID, String vin, LocalDate startDate, LocalDate endDate){
        if (!isAvailable(vin, startDate, endDate)) {
            return null;
        }
        Optional<Car> carOptional = Optional.empty();
        for (Car car : carStorage.getCars()) {
            if (car.getVin().equals(vin)) {
                carOptional = Optional.of(car);
                break;
            }
        }
        Rental rental = new Rental(new User(userID), carOptional.get(), startDate, endDate);
        rentalStorage.addRental(rental);
        return rental;
    }
    public boolean carExist(String vin){

    }

    public boolean isAvailable(String vin, LocalDate startDate, LocalDate endDate){
        boolean carExist = false;
        for (Car car : carStorage.getCars()) {
            if (car.getVin().equals(vin)){
                carExist = true;
                break;
            }
        }

        if (!carExist) {
            return false;
        }

        if (rentalStorage.getRentals().isEmpty()) {
            return true;
        }
        return true;
    }
    public Optional<Car> carExist(String vin);
        for (Car car : carStorage.getCars()){
            if (car.getVin().equals(vin)) {
                return Optional.of(car);
            }
        }
        return Optional.empty()
    }
    private boolean isOverlappingDate(LocalDate startDate, LocalDate endDate, Rental rental){
        boolean isEndDateBeforeRentalStart = endDate.isBefore(rental.getRentalStart());
        boolean isStartDateBeforeRentalStart = startDate.isAfter(rental.getRentalEnd());
        boolean isEndDateBeforeRentalStart || isStartDateBeforeRentalStart);
    }


}
