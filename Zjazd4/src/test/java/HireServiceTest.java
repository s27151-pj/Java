import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Type;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class HireServiceTest {
    private CarWarehouse carWarehouse;
    private HireWarehouse hireWarehouse;
    private HireService hireService;

    @BeforeEach
    void init() {
        carWarehouse = new CarWarehouse();
        hireWarehouse = new HireWarehouse();
        hireService = new HireService(hireWarehouse, carWarehouse);
    }

    @Test
    void shouldCarExistInWarehouse() {
//        GIVEN
        Car car = new Car("ttt","model","vin", CarClass.BUDGET, Boolean.TRUE);
        carWarehouse.addCar(car);

//        WHEN
        Optional<Car> carOptional = hireService.isAvailable(car.getVin());

//        THEN
        assertThat(carOptional).isPresent();
    }

    @Test
    void shouldCarNotExistInWarehouse() {
        //GIVEN
        //WHEN
        Optional<Car> carOptional = hireService.isAvailable("vin");

        //THEN
        assertThat(carOptional).isEmpty();

    }
}