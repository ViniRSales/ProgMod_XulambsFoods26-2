import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PedidoTest {
    Pedido pedido;
<<<<<<< HEAD
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
        
=======
    Pizza pizzaVazia;

    @BeforeEach 
    public void setUp(){
        pedido = new Pedido();
        pizzaVazia = new Pizza();
        pedido.adicionarPizza(pizzaVazia);
    }
    
    @Test
    public void naoAdicionaPizzaEmPedidoFechado(){
        //Arrange
         pedido.fecharPedido();
>>>>>>> 1d715973febee8987a7522a1528f67a91b66b620
        //Act
        int quantidade = pedido.adicionarPizza(new Pizza());
        //Assert
        assertEquals(1, quantidade);
    }

    @Test
<<<<<<< HEAD
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
=======
    public void adicionaPizzasEmPedidoAberto(){
        //Arrange
         pedido.adicionarPizza(pizzaVazia);
        //Act
        int quantidade = pedido.adicionarPizza(new Pizza());
        //Assert
        assertEquals(3, quantidade);
    }

    @Test 
    public void calculaPrecoComUmaPizza(){
        //Act
        double preco = pedido.precoAPagar();
        //Assert
        assertEquals(29d, preco, 0.01);
    }

    @Test 
    public void calculaPrecoComVariasPizzas(){
        //Arrange
        Pizza comIngredientes = new Pizza(2);
        pedido.adicionarPizza(comIngredientes);
        //Act
        double preco = pedido.precoAPagar();
        //Assert
        assertEquals(68d, preco, 0.01);
    }

    @Test 
    public void gerarRelatorioComDetalhes(){
        //Arrange
        pedido.adicionarPizza(new Pizza());
        //Act
        String cupom = pedido.relatorio();
        assertTrue(
            cupom.contains("2 pizzas") &&
            cupom.contains("58,00")
        );    
>>>>>>> 1d715973febee8987a7522a1528f67a91b66b620
    }
}
