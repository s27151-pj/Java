package pl.pjatk.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PizzaServiceITest {

    @Autowired
    private PizzaService pizzaService;

    @Test
    void shouldCalculatePrice() {
        double margharitta = pizzaService.checkPizzaPrice("Margharitta", Size.GIANT);
        assertThat(margharitta).isEqualTo(48);
    }

    @Test
    void shouldFindPizza() {
        Pizza margharitta = pizzaService.findPizzaByName("Margharitta");
        assertThat(margharitta).isNotNull();
    }

}