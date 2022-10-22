import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PagamentoTest
{

    @Test
    void Pagamento_ValorPagoTest()
    {
        Pagamento pagamento = new Pagamento();
        assertAll(
                ()-> assertEquals(0.0, pagamento.getValorPago(), "Valor inicial 0.0"),
                ()-> assertTrue(true)
        );
    }
    @Test
    void Pagamento_DataTest()
    {
        Pagamento pagamento = new Pagamento();
        assertAll(
                ()-> assertNull(pagamento.getData(), "Valor inicial Null"),
                ()-> assertTrue(true)
        );
    }
    @Test
    void Pagamento_TipoPagamento()
    {
        Pagamento pagamento = new Pagamento();
        assertAll(
                ()-> assertNull(pagamento.getTipoPagamento(), "Valor inicial Null"),
                ()-> assertTrue(true)
        );
    }
}