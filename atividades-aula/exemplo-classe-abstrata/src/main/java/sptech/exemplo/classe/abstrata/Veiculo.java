package sptech.exemplo.classe.abstrata;

import java.time.LocalDate;

/**
 *
 * @author alan
 */
public abstract class Veiculo {

    protected String proprietario;
    protected Integer anoFabricacao;
    protected String marca;

    public Veiculo(String proprietario, Integer anoFabricacao, String marca) {
        this.proprietario = proprietario;
        this.anoFabricacao = anoFabricacao;
        this.marca = marca;
    }

    public Integer calcularTempoUso() {
        return LocalDate.now().getYear() - anoFabricacao;
    }
    
    //apagar corpo do método
    public abstract void relatorioDeRevisao();

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "proprietario=" + proprietario + ","
                + " anoFabricacao=" + anoFabricacao + ", marca=" + marca + '}';
    }

}
