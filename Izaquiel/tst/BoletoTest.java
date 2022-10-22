import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoletoTest
{

    @Test
    void Boleto_CodigoTest()
    {
        Boleto boleto = new Boleto();

        assertAll(
                ()-> assertNull(boleto.getCodigo(), "Valor Inicial Null"),
                ()-> assertTrue(true)
        );
    }

}