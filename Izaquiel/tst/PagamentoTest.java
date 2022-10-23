import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PagamentoTest
{

    @Test
    void Pagamento_DataTest()
    {
        Pagamento pagamento = new Pagamento("01/01/2001", "BOLETO", 100.0);
        assertAll(
                ()-> assertNotNull(pagamento.getData(),"Data nao nula (01/01/2001) pelo construtor"),
                ()->
                {
                    assertDoesNotThrow(()->pagamento.setData("02/02/2002"), "set Data nao lança excecao");
                    assertEquals("02/02/2002", pagamento.getData(), "set Data de 01/01/2001 para 02/02/2002");
                }
        );
    }

    @Test
    void Pagamento_ValorPagoTest()
    {
        Pagamento pagamento = new Pagamento("01/01/2001", "BOLETO", 100.0);

        assertAll(
                ()-> assertNotNull(pagamento.getValorPago(),"ValorPago nao nulo (100.0) pelo construtor"),
                ()->
                {
                    assertDoesNotThrow(()->pagamento.setValorPago(99.99), "set ValorPago nao lança excecao");
                    assertEquals(99.99, pagamento.getValorPago(), "set ValorPago de 100.0 para 99.99");
                }
        );

    }

    @Test
    void Pagamento_TipoPagamento()
    {
        Pagamento pagamento = new Pagamento("01/01/2001", "BOLETO", 100.0);
        assertAll(
                ()-> assertNotNull(pagamento.getTipoPagamento(),"TipoPagamento nao nulo (BOLETO) pelo construtor"),
                ()->
                {
                    assertDoesNotThrow(()->pagamento.setTipoPagamento("IRPF"), "set TipoPagamento nao lança excecao");
                    assertEquals("IRPF", pagamento.getTipoPagamento(), "get TipoPagamento de BOLETO para IRPF");
                }
        );
    }
}