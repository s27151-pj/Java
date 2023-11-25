
import java.util.Date;

public class HireService {
    private final HireWarehouse hireWarehouse;
    private final CarWarehouse carWarehouse;

    public HireService(HireWarehouse hireWarehouse, CarWarehouse carWarehouse) {
        this.hireWarehouse = hireWarehouse;
        this.carWarehouse = carWarehouse;
    }

    public boolean isAvailable(String vin, Date dateFrom, Date dateTo) {
        Car car = this.carWarehouse.getCarByVin(vin);
        if (car == null) {
            System.out.println("Car with vin " + vin + " not found");
            return false;
        } else if (!this.hireWarehouse.isAvailableInDate(vin, dateFrom, dateTo)) {
            System.out.println("Car with vin " + vin + " is not available in this date");
            return false;
        } else {
            return true;
        }
    }

    public boolean rent(int userId, String vin, Date dateFrom, Date dateTo) {
        if (!this.isAvailable(vin, dateFrom, dateTo)) {
            return false;
        } else {
            Car car = this.carWarehouse.getCarByVin(vin);
            Customer customer = new Customer(userId, "Marek", "Kowalski");
            Hire hire = new Hire(dateFrom, dateTo, car, customer);
            this.hireWarehouse.addHire(hire);
            car.setIsBorrow(true);
            System.out.println("Car with vin " + vin + " is borrowed by " + String.valueOf(customer));
            return true;
        }
    }

    public Float estimatePrice(String vin, Date dateFrom, Date dateTo) {
        Car car = this.carWarehouse.getCarByVin(vin);
        if (car == null) {
            System.out.println("Car with vin " + vin + " not found");
            return null;
        } else {
            int days = (int)((dateTo.getTime() - dateFrom.getTime()) / 86400000L);
            return 500.0F + 200.0F * (float)days * car.getPriceMultiplier();
        }
    }
}
