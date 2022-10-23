import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FaturaTest
{

    @Test
    void Fatura_DataTest()
    {
        Fatura fatura = new Fatura("01/01/2001", 100.0, "Joao");

        assertAll(
            ()-> assertNotNull(fatura.getData(),"Valortotal nao nulo (01/01/2001) pelo construtor"),
            ()->
            {
                assertDoesNotThrow(()->fatura.setData("02/02/2002"), "set ValorTotal nao lança excecao");
                assertEquals("02/02/2002", fatura.getData(), "set ValorTotal de 100.0 para 99.99");
            }
        );

    }

    @Test
    void Fatura_ValorTotalTest()
    {
        Fatura fatura = new Fatura("01/01/2001", 100.0, "Joao");

        assertAll(
            ()-> assertNotNull(fatura.getValorTotal(),"Valortotal nao nulo (100.0) pelo construtor"),
            ()->
            {
                assertDoesNotThrow(()->fatura.setValorTotal(99.99), "set ValorTotal nao lança excecao");
                assertEquals(99.99, fatura.getValorTotal(), "set ValorTotal de 100.0 para 99.99");
            }
        );

    }
    @Test
    void Fatura_NomeClienteTest()
    {
        Fatura fatura = new Fatura("01/01/2001", 100.0, "Joao");

        assertAll(
                ()-> assertNotNull(fatura.getNomeCliente(),"NomeCLiente nao nulo (Joao) pelo construtor"),
                ()->
                {
                    assertDoesNotThrow(()->fatura.setNomeCliente("Everton"), "set NomeCliente nao lança excecao");
                    assertEquals("Everton", fatura.getNomeCliente(), "set NomeCliente de Joao para Everton");
                }
        );
    }
}
