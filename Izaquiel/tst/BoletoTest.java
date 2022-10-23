import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoletoTest
{

    @Test
    void Boleto_CodigoTest()
    {
        Boleto boleto = new Boleto("1234321", "01/01/2001", 100.0);

        assertAll(
                ()-> assertNotNull(boleto.getCodigo(), "Codigo nao nulo (1234321) pelo construtor"),
                ()-> {
                    assertDoesNotThrow(()->boleto.setCodigo("654321"));
                    assertEquals("654321", boleto.getCodigo());
                }
        );
    }

    @Test
    void Boleto_DataTest()
    {
        Boleto boleto = new Boleto("1234321", "01/01/2001", 100.0);

        assertAll(
                ()-> assertNotNull(boleto.getData(), "Codigo nao nulo (1234321) pelo construtor"),
                ()-> {
                    assertDoesNotThrow(()->boleto.setData("02/02/2002"));
                    assertEquals("02/02/2002", boleto.getData());
                }
        );
    }

    @Test
    void Boleto_ValorPagoTest()
    {
        Boleto boleto = new Boleto("1234321", "01/01/2001", 100.0);

        assertAll(
                ()-> assertNotNull(boleto.getValorPago(), "ValorPago nao nulo (1234321) pelo construtor"),
                ()-> {
                    assertDoesNotThrow(()->boleto.setValorPago(99.99));
                    assertEquals(99.99, boleto.getCodigo());
                }
        );
    }

}