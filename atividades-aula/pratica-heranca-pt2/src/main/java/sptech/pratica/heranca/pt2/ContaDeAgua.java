package sptech.pratica.heranca.pt2;

/**
 *
 * @author alan
 */
public class ContaDeAgua extends Boleto {

    private Integer qtdLitrosGastos;
    private Double valorLitro;
    private Double taxaEsgoto;

    public ContaDeAgua(Integer qtdLitrosGastos, Double valorLitro,
            Double taxaEsgoto, String cobrador, String titular,
            String dtVencimento, Double juroDeAtraso, Double valorCobranca) {
        super(cobrador, titular, dtVencimento, juroDeAtraso, valorCobranca);
        this.qtdLitrosGastos = qtdLitrosGastos;
        this.valorLitro = valorLitro;
        this.taxaEsgoto = taxaEsgoto;
    }

    public Double calcularTotalAPagar() {
        return ((qtdLitrosGastos * valorLitro) + taxaEsgoto);
    }

    public Integer getQtdLitrosGastos() {
        return qtdLitrosGastos;
    }

    public void setQtdLitrosGastos(Integer qtdLitrosGastos) {
        this.qtdLitrosGastos = qtdLitrosGastos;
    }

    public Double getValorLitro() {
        return valorLitro;
    }

    public void setValorLitro(Double valorLitro) {
        this.valorLitro = valorLitro;
    }

    public Double getTaxaEsgoto() {
        return taxaEsgoto;
    }

    public void setTaxaEsgoto(Double taxaEsgoto) {
        this.taxaEsgoto = taxaEsgoto;
    }

    @Override
    public String toString() {
        return String.format("%s \n"
                + "Total a pagar: R$%.2f", super.toString(),
                this.calcularTotalAPagar());
    }

}
