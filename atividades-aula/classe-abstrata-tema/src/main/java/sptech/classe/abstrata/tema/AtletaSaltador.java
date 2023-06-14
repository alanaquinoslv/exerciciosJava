package sptech.classe.abstrata.tema;

/**
 *
 * @author alan
 */
public class AtletaSaltador extends Atleta {

    private double alturaMaxima;

    public AtletaSaltador(String nome, int idade, double alturaMaxima) {
        super(nome, idade);
        this.alturaMaxima = alturaMaxima;
    }

    @Override
    public void treinar() {
        System.out.println("O atleta " + nome + " está saltando para alcançar alturas maiores.");
    }

    public double getAlturaMaxima() {
        return alturaMaxima;
    }
}
