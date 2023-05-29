package sptech.ac03.atividade03;

/**
 *
 * @author alan
 */
public class Palestrante extends Professor {

    private int qtdLive;
    private double valorLive;

    public Palestrante(String nome, String curso, Double valorCurso,
            Integer qtdAlunos, Integer qtdLive, Double valorLive) {
        super(nome, curso, valorCurso, qtdAlunos);
        this.qtdLive = qtdLive;
        this.valorLive = valorLive;
    }

    @Override
    public double calcularGanho() {
        double ganhoCurso = super.calcularGanho();
        double ganhoLive = qtdLive * valorLive;
        return ganhoCurso + ganhoLive;
    }

    public int getQtdLive() {
        return qtdLive;
    }

    public void setQtdLive(Integer qtdLive) {
        this.qtdLive = qtdLive;
    }

    public double getValorLive() {
        return valorLive;
    }

    public void setValorLive(Integer valorLive) {
        this.valorLive = valorLive;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nQuantidade de Lives: " + qtdLive
                + "\nValor por Live: R$ " + valorLive
                + "\nGanho Total: R$ " + calcularGanho();
    }
}
