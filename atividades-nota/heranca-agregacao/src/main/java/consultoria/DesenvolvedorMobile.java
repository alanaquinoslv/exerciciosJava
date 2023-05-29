package consultoria;

/**
 *
 * @author alan
 */
public class DesenvolvedorMobile extends Desenvolvedor {

    private Integer qtdHorasTrabalhadasMobile;
    private Double valorHoraTrabalhadaMobile;

    public DesenvolvedorMobile(Integer qtdHorasTrabalhadasMobile,
            Double valorHoraTrabalhadaMobile, String nome,
            Integer qtdHorasTrabalhadas, Double valorHoraTrabalhada) {
        super(nome, qtdHorasTrabalhadas, valorHoraTrabalhada);
        this.qtdHorasTrabalhadasMobile = qtdHorasTrabalhadasMobile;
        this.valorHoraTrabalhadaMobile = valorHoraTrabalhadaMobile;
    }

    @Override
    public Double getSalario() {
        return (super.getSalario()
                + (this.valorHoraTrabalhadaMobile * this.qtdHorasTrabalhadasMobile));
    }

    public Integer getQtdHorasTrabalhadasMobile() {
        return qtdHorasTrabalhadasMobile;
    }

    public void setQtdHorasTrabalhadasMobile(Integer qtdHorasTrabalhadasMobile) {
        this.qtdHorasTrabalhadasMobile = qtdHorasTrabalhadasMobile;
    }

    public Double getValorHoraTrabalhadaMobile() {
        return valorHoraTrabalhadaMobile;
    }

    public void setValorHoraTrabalhadaMobile(Double valorHoraTrabalhadaMobile) {
        this.valorHoraTrabalhadaMobile = valorHoraTrabalhadaMobile;
    }

    @Override
    public String toString() {
        return String.format("%s \n"
                + "Salário: R$%.2f",
                super.toString(),
                this.getSalario());
    }

}
