public class Fatura
{
    public String data;
    private double valorTotal;
    private String nomeCliente;

    public Fatura(String data, double valorTotal, String nomeCliente)
    {
        this.data = data;
        this.valorTotal = valorTotal;
        this.nomeCliente = nomeCliente;
    }

    public String getData()
    {
        return data;
    }

    public void setData(String data)
    {
        this.data = data;
    }

    public double getValorTotal()
    {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal)
    {
        this.valorTotal = valorTotal;
    }

    public String getNomeCliente()
    {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente)
    {
        this.nomeCliente = nomeCliente;
    }
}
