package org.example;

import java.time.LocalDate;
public class CarRentInfo {
    public user user;
    public int VIN;

    private LocalDate dateNow;
    private LocalDate dateTo;

    public CarRentInfo(user user, int VIN, LocalDate dateNow, LocalDate dateTo) {
        this.user = user;
        this.VIN = VIN;
        this.dateNow = dateNow;
        this.dateTo = dateTo;
    }

    public String getUser() {
        return String.valueOf(this.user);
    }

    public void setUser(user user) {
        this.user = user;
    }

    public int getVIN() {
        return VIN;
    }

    public LocalDate getDateNow() {
        return dateNow;
    }

    public void setDateNow(LocalDate dateNow) {
        this.dateNow = dateNow;
    }

    public LocalDate getDateTo() {
        return dateTo;
    }

    public void setDateTo(LocalDate dateTo) {
        this.dateTo = dateTo;
    }

    public void setVIN(int VIN) {
        this.VIN = VIN;
    }

}
