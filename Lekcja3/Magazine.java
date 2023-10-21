import java.util.ArrayList;
import java.util.List;

public class Magazine {
    private List<Car> cars = new ArrayList<>();

    private Magazine() {
    }
    public static Magazine getInstance(){
        if (instance == null) {
            instance = new Magazine();
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
