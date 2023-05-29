package sptech.pratica.heranca.pt1;

/**
 *
 * @author alan
 */
public class Time {

    protected String nome;
    protected String cidade;
    protected String estadoUF;
    protected Double valorIngresso;
    protected Integer jogosJogados;
    protected Double mediaPublico;

    public Time(String nome, String cidade, String estadoUF,
            Double valorIngresso, Integer jogosJogados, Double mediaPublico) {
        this.nome = nome;
        this.cidade = cidade;
        this.estadoUF = estadoUF;
        this.valorIngresso = valorIngresso;
        this.jogosJogados = jogosJogados;
        this.mediaPublico = mediaPublico;
    }

    public Double getRendaTotal() {
        return ((valorIngresso * mediaPublico) * jogosJogados);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstadoUF() {
        return estadoUF;
    }

    public void setEstadoUF(String estadoUF) {
        this.estadoUF = estadoUF;
    }

    public Double getValorIngresso() {
        return valorIngresso;
    }

    public void setValorIngresso(Double valorIngresso) {
        this.valorIngresso = valorIngresso;
    }

    public Integer getJogosJogados() {
        return jogosJogados;
    }

    public void setJogosJogados(Integer jogosJogados) {
        this.jogosJogados = jogosJogados;
    }

    public Double getMediaPublico() {
        return mediaPublico;
    }

    public void setMediaPublico(Double mediaPublico) {
        this.mediaPublico = mediaPublico;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s \n"
                + "Cidade: %s \n"
                + "UF: %s"
                + "Valor ingresso: R$%.2f \n"
                + "Jogos jogados: %d \n"
                + "Média de público: %.2f",
                cidade, estadoUF, valorIngresso,
                jogosJogados, mediaPublico);
    }

}
