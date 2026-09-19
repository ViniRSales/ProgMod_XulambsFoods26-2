import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PedidoTest {
    Pedido pedido;
    Pizza pizzaPadrao;

    @BeforeEach
    public void setUp(){
        //Arrange
        pedido = new Pedido();
        pizzaPadrao = new Pizza();
        pedido.adicionarPizza(pizzaPadrao);
    }

    @Test
    public void naoAdicionaPizzaEmPedidoFechado(){
        //Arrange
        pedido.fecharPedido();
        
        //Act
        int quantidade = pedido.adicionarPizza(new Pizza());
    
        //Assert
        assertEquals(1, quantidade);
    }

    @Test
    public void naoAdicionaIngredientesAlemDoMaximo(){
        //Act
        int adicionaIngrediente = pizzaPadrao.adicionarIngredientes(9);
    
        //Assert
        assertEquals(0, adicionaIngrediente);
    }

   
    @Test
    public void AdicionaPizzaEmPedidoAberto(){
        //Arrange
        
        //Act
        int quantidade = pedido.adicionarPizza(new Pizza());
    
        //Assert
        assertEquals(2, quantidade);
    }
}
