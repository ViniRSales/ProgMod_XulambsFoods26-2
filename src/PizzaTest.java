import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class PizzaTest {

    @Test
    public void adicionaIngredientesCorretamente(){
        //Arrange
        Pizza pizza = new Pizza();

        //Act
        int quantos = pizza.adicionarIngredientes(4);

        //Assert
        assertEquals(4, quantos);
    }

    @Test
    public void NaoAdicionaValorAcima(){
        //Arrange
        Pizza pizza = new Pizza();

        //Act
        int quantos = pizza.adicionarIngredientes(9);

        //Assert
        assertNull(quantos);
    }
    
}
