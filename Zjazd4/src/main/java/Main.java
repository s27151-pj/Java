import java.util.Date;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        HireService hireService = new HireService(HireWarehouse.getInstance(), CarWarehouse.getInstance());
        CarWarehouse.getInstance().addCar(new Car("BMW", "X5", "12345", CarClass.PREMIUM, false));
        CarWarehouse.getInstance().addCar(new Car("Fiat", "126p", "67890", CarClass.BUDGET, false));
        Boolean available = hireService.isAvailable("12345", new Date(2020, 1, 1), new Date(2020, 1, 10));
        System.out.println(available);
        if (available) {
            hireService.rent(1, "12345", new Date(2020, 1, 1), new Date(2020, 1, 10));
        }

        System.out.println(HireWarehouse.getInstance());
    }
}