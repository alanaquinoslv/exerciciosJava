package sptech.classe.abstrata.figura;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alan
 */
public class Imagem {

    private List<Figura> figuras = new ArrayList<>();

    public void adicionaFigura(Figura f) {
        figuras.add(f);
    }

    public void exibeFiguras() {
        for (Figura f : figuras) {
            System.out.println(f);
        }
    }

    public void exibeSomaAreas() {
        double soma = 0;
        for (Figura f : figuras) {
            soma += f.calculaArea();
        }
        System.out.println("A soma das áreas é: " + soma);
    }

    public void exibeFiguraAreaMaior20() {
        for (Figura f : figuras) {
            if (f.calculaArea() > 20) {
                System.out.println(f);
            }
        }
    }

    public void exibeQuadrados() {
        for (Figura f : figuras) {
            if (f instanceof Quadrado) {
                System.out.println(f);
            }
        }
    }
}
