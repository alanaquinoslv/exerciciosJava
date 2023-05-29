package sptech.pratica.heranca.pt1;

/**
 *
 * @author alan
 */
public class CategoriaBase extends Time {

    private String categoria;
    private Double valorIngressoBase;
    private Integer jogosJogadosBase;
    private Double mediaPublicoBase;

    public CategoriaBase(String categoria, Double valorIngressoBase,
            Integer jogosJogadosBase, Double mediaPublicoBase, String nome,
            String cidade, String estadoUF, Double valorIngresso,
            Integer jogosJogados, Double mediaPublico) {
        super(nome, cidade, estadoUF, valorIngresso, jogosJogados, mediaPublico);
        this.categoria = categoria;
        this.valorIngressoBase = valorIngressoBase;
        this.jogosJogadosBase = jogosJogadosBase;
        this.mediaPublicoBase = mediaPublicoBase;
    }

    @Override
    public Double getRendaTotal() {
        return (super.getRendaTotal()
                + ((this.valorIngressoBase * this.mediaPublicoBase) * this.jogosJogadosBase));
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Double getValorIngressoBase() {
        return valorIngressoBase;
    }

    public void setValorIngressoBase(Double valorIngressoBase) {
        this.valorIngressoBase = valorIngressoBase;
    }

    public Integer getJogosJogadosBase() {
        return jogosJogadosBase;
    }

    public void setJogosJogadosBase(Integer jogosJogadosBase) {
        this.jogosJogadosBase = jogosJogadosBase;
    }

    public Double getMediaPublicoBase() {
        return mediaPublicoBase;
    }

    public void setMediaPublicoBase(Double mediaPublicoBase) {
        this.mediaPublicoBase = mediaPublicoBase;
    }

    @Override
    public String toString() {
        return String.format("%s \n"
                + "--- BASE ---"
                + "Categoria: %s \n"
                + "Renda total: R%.2f",
                super.toString(), categoria, this.getRendaTotal());
    }

}
