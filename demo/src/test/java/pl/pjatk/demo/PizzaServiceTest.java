package pl.pjatk.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class PizzaServiceTest {

    @Mock
    private PizzaStorage pizzaStorage;

    @InjectMocks
    private PizzaService pizzaService;

    @Test
    void shouldDoSomething() {
        when(pizzaStorage.getPizzaList())
                .thenReturn(List.of(new Pizza("Margharitta", 15)));
        double margharitta = pizzaService.checkPizzaPrice("Margharitta", Size.GIANT);
        assertThat(margharitta).isEqualTo(30);
    }

}