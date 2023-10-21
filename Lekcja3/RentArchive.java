import java.time.LocalDate;
public class RentArchive {
private User user;
private Car car;
private LocalDate rentalStart;
private LocalDate rentalEnd;

    public RentArchive(User user, Car car, LocalDate rentalStart, LocalDate rentalEnd) {
        this.user = user;
        this.car = car;
        this.rentalStart = rentalStart;
        this.rentalEnd = rentalEnd;
    }
    public User getUser() {
        return user;
    }
}
