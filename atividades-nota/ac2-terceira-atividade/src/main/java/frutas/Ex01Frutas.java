package frutas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author alan
 */
public class Ex01Frutas {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> listaFrutas = new ArrayList();

        listaFrutas.add("Maçã");
        listaFrutas.add("Uva");
        listaFrutas.add("Banana");
        listaFrutas.add("Manga");
        listaFrutas.add("Abacaxi");
        listaFrutas.add("Acerola");
        listaFrutas.add("Morango");
        listaFrutas.add("Mamão");
        listaFrutas.add("Limão");
        listaFrutas.add("Cereja");

        System.out.println("Pesquise uma fruta:");
        String frutaPesquisada = scan.nextLine();
        Boolean frutaEncontrada = false;

        for (int i = 0; i < listaFrutas.size(); i++) {
            if (listaFrutas.get(i).equalsIgnoreCase(frutaPesquisada)) {
                frutaEncontrada = true;
            }
        }
        
        if (frutaEncontrada) {
            System.out.println(String.format("A fruta %s existe na lista.", frutaPesquisada));
        } else {
            System.out.println(String.format("A fruta %s não existe na lista", frutaPesquisada));
        }
    }
}
