import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class ProcessadorTest
{
    @Test
    public void Processador_Test()
    {
        Boleto boleto1 = new Boleto("123456", "20/10/2022", 500.00);
        Boleto boleto2 = new Boleto("123456", "19/10/2022", 400.00);
        Boleto boleto3 = new Boleto("123456", "21/10/2022", 600.00);
        Boleto[] boletos = new Boleto[]{boleto1, boleto2, boleto3};

        Processador processador = new Processador(boletos);

        assertAll(
                ()-> assertNotNull(processador.getBoletos(), "Boletos nao nulos (boleto1..boleto3) pelo construtor"),
                ()-> {
                    Boleto[] boletos_new = new Boleto[] {boleto1, boleto3};
                    assertDoesNotThrow(()->processador.setBoletos(boletos_new));
                    assertEquals(boletos_new, processador.getBoletos());
                }
        );
    }

    @Test
    public void Processador_SomaValorBoletosMaiorValorFaturaThenFaturaPagaTest(){
        Boleto boleto1 = new Boleto("123456", "20/10/2022", 500.00);
        Boleto boleto2 = new Boleto("123456", "19/10/2022", 400.00);
        Boleto boleto3 = new Boleto("123456", "21/10/2022", 600.00);
        Boleto[] boletos = new Boleto[]{boleto1, boleto2, boleto3};

        Processador processador = new Processador(boletos);

    }

}
