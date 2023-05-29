package produtora;

/**
 *
 * @author alan
 */
public class Protagonista extends Ator {

    private Integer qtdHorasTrabalhadasProtagonista;
    private Double valorHoraTrabalhadaProtagonista;

    public Protagonista(Integer qtdHorasTrabalhadasProtagonista,
            Double valorHoraTrabalhadaProtagonista, String nome,
            Integer qtdHorasTrabalhadas, Double valorHoraTrabalhada) {
        super(nome, qtdHorasTrabalhadas, valorHoraTrabalhada);
        this.qtdHorasTrabalhadasProtagonista = qtdHorasTrabalhadasProtagonista;
        this.valorHoraTrabalhadaProtagonista = valorHoraTrabalhadaProtagonista;
    }

    @Override
    public Double getSalario() {
        return (super.getSalario() + (this.valorHoraTrabalhadaProtagonista
                * this.qtdHorasTrabalhadasProtagonista));
    }

    public Integer getQtdHorasTrabalhadasProtagonista() {
        return qtdHorasTrabalhadasProtagonista;
    }

    public void setQtdHorasTrabalhadasProtagonista(Integer qtdHorasTrabalhadasProtagonista) {
        this.qtdHorasTrabalhadasProtagonista = qtdHorasTrabalhadasProtagonista;
    }

    public Double getValorHoraTrabalhadaProtagonista() {
        return valorHoraTrabalhadaProtagonista;
    }

    public void setValorHoraTrabalhadaProtagonista(Double valorHoraTrabalhadaProtagonista) {
        this.valorHoraTrabalhadaProtagonista = valorHoraTrabalhadaProtagonista;
    }

    @Override
    public String toString() {
        return String.format("%s \n"
                + "Salário: R$%.2f", super.toString(),
                this.getSalario());
    }

}
