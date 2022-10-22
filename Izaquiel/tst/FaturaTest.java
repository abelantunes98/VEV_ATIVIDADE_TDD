import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FaturaTest
{

    Fatura fatura = new Fatura();

    @Test
    void Fatura_dataTest()
    {
        assertAll(
                ()-> assertNull(fatura.getData()),
                ()-> assertTrue(true)
        );
    }
    @Test
    void Fatura_ValorTotalTest()
    {
        assertAll(
                ()-> assertEquals(0.0, fatura.getValorTotal()),
                ()-> assertTrue(true)
        );
    }
    @Test
    void Fatura_NomeClienteTest()
    {
        assertAll(
                ()-> assertNull(fatura.getNomeCliente()),
                ()-> assertTrue(true)
        );
    }
}
