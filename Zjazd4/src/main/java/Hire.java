import java.util.Date;

public class Hire {
    private Date dateFrom;
    private Date dateTo;
    private Car car;
    private Customer customer;

    public Hire(Date dateFrom, Date dateTo, Car car, Customer customer) {
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.car = car;
        this.customer = customer;
    }

    public Date getDateFrom() {
        return this.dateFrom;
    }

    public Date getDateTo() {
        return this.dateTo;
    }

    public Car getCar() {
        return this.car;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String toString() {
        String var10000 = String.valueOf(this.dateFrom);
        return "Hire: " + var10000 + " - " + String.valueOf(this.dateTo) + ", " + this.car.toString() + ", " + this.customer.toString();
    }
}
