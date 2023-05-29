package sptech.exercicio.personagem;

import java.util.List;

/**
 *
 * @author alan
 */
public class Vilao extends Personagem {

    public Vilao(String codinome, String nome) {
        super(codinome, nome);
    }

    private List<SuperPoder> poderes;

    // Métodos
    public double getForcaTotal() {
        double forcaTotal = 0;
        for (SuperPoder poder : poderes) {
            forcaTotal += poder.getCategoria();
        }
        return forcaTotal;
    }

}
