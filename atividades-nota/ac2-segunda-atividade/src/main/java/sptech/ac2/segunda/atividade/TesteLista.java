package sptech.ac2.segunda.atividade;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author alan
 */
public class TesteLista {

    public static void main(String[] args) {
        List listaEstranha = new ArrayList();

        //Métodos que mais usaremos no array list
        // add: adicionar na lista
        // size: tamanho da lista
        // get: busca objeto através do index
        //remove: remove o elemento por objeto ou index
        listaEstranha.add("Alan");
        listaEstranha.add(21);
        listaEstranha.add(34.09);
        listaEstranha.add(false);

        System.out.println(listaEstranha);

        // não é bom criar sem tipo
        List<String> listaNome = new ArrayList();

        listaNome.add("Maria");
        listaNome.add("Alan");
        listaNome.add("Jorge");

        System.out.println(listaNome);

        //pegando nome da posição 2
        String nome2 = listaNome.get(2);
        System.out.println("Nome 2:" + nome2);

        // for para exibir lista: for tradicional                   
        for (int i = 0; i < listaNome.size(); i++) {
            System.out.println(String.format("%d - nome: %s", i,
                    listaNome.get(i)));
        }

        //removendo elementos
//        listaNome.remove(2);
        //removendo com for
        for (int i = 0; i < listaNome.size(); i++) {
            if (listaNome.get(i).equals("Jorge")) {
                listaNome.remove(i);
            }
        }

        System.out.println(listaNome);

        //gambiarra
        listaNome.removeAll(listaNome);
        //o clear existe para isso
        listaNome.clear();

        System.out.println("Lista de atividades:");
        List<Atividade> atividades = new ArrayList();
        Atividade atv01 = new Atividade("Diagrama", "Alan", 3);
        Atividade atv02 = new Atividade("Dashboard", "Victor", 5);
        Atividade atv03 = new Atividade("Documentação", "Sara", 1);

        atividades.add(atv01);
        atividades.add(atv02);
        atividades.add(atv03);

        System.out.println("Mostrando atividades com menos de 5 dias estimados");
        for (int i = 0; i < atividades.size(); i++) {
            Atividade atividadeDaVez = atividades.get(i);

            if (atividadeDaVez.getDiasEstimados() < 5) {
                System.out.println(atividadeDaVez);
            }
        }

        //util para percorrer lista inteira
        System.out.println("Mesma coisa com enhanced for");
        for (Atividade atividadeDaVez : atividades) {

            if (atividadeDaVez.getDiasEstimados() < 5) {
                System.out.println(atividadeDaVez);
            }
        }
    }
}
