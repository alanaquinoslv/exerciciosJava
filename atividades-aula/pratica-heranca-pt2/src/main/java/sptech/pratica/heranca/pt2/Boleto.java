package sptech.pratica.heranca.pt2;

/**
 *
 * @author alan
 */
public class Boleto {

    protected String cobrador;
    protected String titular;
    protected String dtVencimento;
    protected Double juroDeAtraso;
    protected Double valorCobranca;

    public Boleto(String cobrador, String titular, String dtVencimento, Double juroDeAtraso, Double valorCobranca) {
        this.cobrador = cobrador;
        this.titular = titular;
        this.dtVencimento = dtVencimento;
        this.juroDeAtraso = juroDeAtraso;
        this.valorCobranca = valorCobranca;
    }

    public String gerarBoleto() {
        String boleto = String.format("Quem vai receber: %s \n"
                + "Titular: %s \n"
                + "Valor total: %s \n"
                + "Data vencimento: %s", titular,
                titular, valorCobranca, dtVencimento);

        return boleto;
    }

    public String getCobrador() {
        return cobrador;
    }

    public void setCobrador(String cobrador) {
        this.cobrador = cobrador;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getDtVencimento() {
        return dtVencimento;
    }

    public void setDtVencimento(String dtVencimento) {
        this.dtVencimento = dtVencimento;
    }

    public Double getJuroDeAtraso() {
        return juroDeAtraso;
    }

    public void setJuroDeAtraso(Double juroDeAtraso) {
        this.juroDeAtraso = juroDeAtraso;
    }

    public Double getValorCobranca() {
        return valorCobranca;
    }

    public void setValorCobranca(Double valorCobranca) {
        this.valorCobranca = valorCobranca;
    }

    @Override
    public String toString() {
        return String.format("Cobrador: %s \n"
                + "Titular: %s \n"
                + "Data vencimento: %s \n"
                + "Juros de atraso: R$%.2f \n"
                + "Valor cobrança: R$%.2f", cobrador, titular,
                dtVencimento, juroDeAtraso, valorCobranca);
    }

}
