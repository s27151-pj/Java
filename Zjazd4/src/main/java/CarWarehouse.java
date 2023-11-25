import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarWarehouse {
    private static CarWarehouse instance;
    private List<Car> cars = new ArrayList();

    public CarWarehouse() {
    }

    public void addCar(Car car) {
        this.cars.add(car);
    }

    public void removeCar(Car car) {
        this.cars.remove(car);
    }

    public List<Car> getCars() {
        return this.cars;
    }

    public Car getCarByVin(String vin) {
        Iterator var2 = this.cars.iterator();

        Car car;
        do {
            if (!var2.hasNext()) {
                return null;
            }

            car = (Car)var2.next();
        } while(!car.getVin().equals(vin));

        return car;
    }

    public String toString() {
        String result = "";

        Car car;
        for(Iterator var2 = this.cars.iterator(); var2.hasNext(); result = result + car.toString() + "\n") {
            car = (Car)var2.next();
        }

        return result;
    }

    public static CarWarehouse getInstance() {
        if (instance == null) {
            instance = new CarWarehouse();
        }

        return instance;
    }
}
