public class Pagamento
{
    private String data;
    private String tipoPagamento;
    private double valorPago;

    public Pagamento(String data, String tipoPagamento, double valorPago)
    {
        this.data = data;
        this.tipoPagamento = tipoPagamento;
        this.valorPago = valorPago;
    }

    public Pagamento setData(String data)
    {
        this.data = data;
        return this;
    }

    public Pagamento setTipoPagamento(String tipoPagamento)
    {
        this.tipoPagamento = tipoPagamento;
        return this;
    }

    public Pagamento setValorPago(double novoValorPago)
    {
        this.valorPago = novoValorPago;
        return this;
    }

    public String getData()
    {
        return this.data;
    }

    public String getTipoPagamento()
    {
        return this.tipoPagamento;
    }

    public double getValorPago()
    {
        return this.valorPago;
    }

}
