package sptech.pratica.heranca.pt2;

/**
 *
 * @author alan
 */
public class ContaDeLuz extends Boleto {

    private Integer qtdKwhUtilizados;
    private Double valorKwh;

    public ContaDeLuz(Integer qtdKwhUtilizados, Double valorKwh,
            String cobrador, String titular, String dtVencimento,
            Double juroDeAtraso, Double valorCobranca) {
        super(cobrador, titular, dtVencimento, juroDeAtraso, valorCobranca);
        this.qtdKwhUtilizados = qtdKwhUtilizados;
        this.valorKwh = valorKwh;
    }

    public Double calcularTotalAPagar() {
        return (qtdKwhUtilizados * valorKwh);
    }

    public Integer getQtdKwhUtilizados() {
        return qtdKwhUtilizados;
    }

    public void setQtdKwhUtilizados(Integer qtdKwhUtilizados) {
        this.qtdKwhUtilizados = qtdKwhUtilizados;
    }

    public Double getValorKwh() {
        return valorKwh;
    }

    public void setValorKwh(Double valorKwh) {
        this.valorKwh = valorKwh;
    }

    @Override
    public String toString() {
        return String.format("%s \n"
                + "Total a pagar: R$%.2f", super.toString(),
                this.calcularTotalAPagar());
    }

}
