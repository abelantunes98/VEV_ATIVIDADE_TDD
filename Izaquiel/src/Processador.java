public class Processador
{
    private Boleto[] boletos;
    public Processador(Boleto[] boletos)
    {
        this.boletos = boletos;
    }

    public Boleto[] getBoletos()
    {
        return boletos;
    }

    public void setBoletos(Boleto[] boletos)
    {
        this.boletos = boletos;
    }
}
