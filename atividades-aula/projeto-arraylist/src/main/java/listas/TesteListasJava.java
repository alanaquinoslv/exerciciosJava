package listas;

import controle.atividades.Atividade;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class TesteListasJava {
    public static void main(String[] args) {
        List listaEstranha = new ArrayList();
        
        //Métodos que mais usaremos:
        // add: adicionar na lista
        // size: tamanho da lista
        // get: busca objeto através do indice
        // remove: remove elemento por objeto ou indice
        
        listaEstranha.add("Xampson");
        listaEstranha.add(42);
        listaEstranha.add(42.50);
        listaEstranha.add(false);
        
        System.out.println(listaEstranha);
        
        //Não é legal criar uma lista sem TIPO
                
        List<String> listaNomes = new ArrayList();        
        listaNomes.add("Maria");
        listaNomes.add("João");
        listaNomes.add("Bob");
        
        System.out.println(listaNomes);
        
        
        //Pegando o nome da posição 2
        String nome2 = listaNomes.get(2);
        System.out.println("Nome 2: " + nome2);
        
        //For para exibir a lista: for tradicional:
        for(int i = 0; i < listaNomes.size(); i++){
            System.out.println(
                    String.format(
                            "%dº nome: %s", 
                            i, listaNomes.get(i)));
        }
        
        //Removendo um elemento
//        listaNomes.remove("Bob");
//        listaNomes.remove(2);

        System.out.println("Removendo o Bob");
        for (int i = 0; i < listaNomes.size(); i++) {
            if(listaNomes.get(i).equals("Bob")){
                listaNomes.remove(i);
            }
        }
        System.out.println(listaNomes);
        
        //gambiarra:
        listaNomes.removeAll(listaNomes);
        //já tem o clear pra isso:
        listaNomes.clear();
        
        System.out.println("Lista de Atividades:");
        List<Atividade> atividades = new ArrayList();
        
        Atividade ativ01 = new Atividade("Preparar Aula", "Giuliana", 10);
        Atividade ativ02 = new Atividade("Tirar Música", "William", 6);
        Atividade ativ03 = new Atividade("Pintar as paredes de casa", "Xampson", 2);
        
        atividades.add(ativ01);
        atividades.add(ativ02);
        atividades.add(ativ03);
        
        System.out.println("Mostrando atividades com menos de 7 dias estimados");
        for (int i = 0; i < atividades.size(); i++) {
            Atividade atividadeDaVez = atividades.get(i);
            if(atividadeDaVez.getDiasEstimados() < 7){
                System.out.println(atividadeDaVez);
            }
            
        }
        System.out.println("Mesma coisa mas com enhanced for:");
       // util para percorrer a lista INTEIRA
       // 
        for (Atividade atividadeDaVez : atividades) {
            if(atividadeDaVez.getDiasEstimados() < 7){
                System.out.println(atividadeDaVez);
            }
        }
        
    }
}
