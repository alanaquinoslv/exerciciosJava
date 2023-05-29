package sptech.exercicio.personagem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alan
 */
public class Heroi extends Personagem {

    private List<SuperPoder> poderes;

    public Heroi(String codinome, String nome) {
        super(codinome, nome);
        this.poderes = new ArrayList<>();
    }

    @Override
    public double getForcaTotal() {
        double forcaTotal = 0;
        for (SuperPoder p : poderes) {
            forcaTotal += p.getCategoria();
        }
        return forcaTotal * 1.15;
    }

}
