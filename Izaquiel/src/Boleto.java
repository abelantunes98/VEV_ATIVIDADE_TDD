public class Boleto
{
    private String codigo;
    private String data;
    private double valorPago;

    public Boleto(String codigo, String data, double valorPago){
        this.codigo = codigo;
        this.data = data;
        this.valorPago = valorPago;
    }

    public void setCodigo(String codigo)
    {
        this.codigo = codigo;
    }

    public String getData()
    {
        return data;
    }

    public void setData(String data)
    {
        this.data = data;
    }

    public double getValorPago()
    {
        return valorPago;
    }

    public void setValorPago(double valorPago)
    {
        this.valorPago = valorPago;
    }


    public String getCodigo()
    {
        return this.codigo;
    }
}
