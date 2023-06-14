package sptech.classe.abstrata.tema;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author alan
 */
public class TesteAtletas {

    private static List<Atleta> listaAtletas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println(String.format("Escolha uma opção: \n"
                    + "1. Treinar atleta corredor \n"
                    + "2. Treinar atleta saltador \n"
                    + "0. Sair"));

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    treinarAtletaCorredor();
                    break;
                case 2:
                    treinarAtletaSaltador();
                    break;
                case 0:
                    System.out.println("Até logo!");
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);
    }

    private static void treinarAtletaCorredor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do atleta corredor: ");
        String nome = scanner.nextLine();
        System.out.println("Digite a idade do atleta corredor:");
        Integer idade = scanner.nextInt();
        System.out.println("Digite a velocidade máxima do atleta corredor:");
        Integer velocidadeMaxima = scanner.nextInt();

        AtletaCorredor atleta = new AtletaCorredor(nome, idade, velocidadeMaxima);
        atleta.treinar();
        System.out.println(String.format("Nome: %s \n"
                + "Idade: %d \n"
                + "Velocidade máxima: %d",
                nome, idade, velocidadeMaxima));
    }

    private static void treinarAtletaSaltador() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do atleta saltador: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a idade do atleta saltador: ");
        Integer idade = scanner.nextInt();
        System.out.print("Digite a altura máxima do atleta saltador: ");
        Double alturaMaxima = scanner.nextDouble();

        AtletaSaltador atleta = new AtletaSaltador(nome, idade, alturaMaxima);
        atleta.treinar();

        System.out.println(String.format("Nome: \n"
                + "Idade: \n"
                + "Altura máxima: ",
                nome, idade, alturaMaxima));
    }

    private static void exibirListaAtletas() {
        System.out.println("\nLISTA DE ATLETAS:");
        if (listaAtletas.isEmpty()) {
            System.out.println("Nenhum atleta cadastrado.");
        } else {
            for (Atleta atleta : listaAtletas) {
                System.out.println("Nome: " + atleta.getNome());
                System.out.println("Idade: " + atleta.getIdade());
                if (atleta instanceof AtletaCorredor) {
                    System.out.println("Tipo: Atleta Corredor");
                    System.out.println("Velocidade Máxima: " + ((AtletaCorredor) atleta).getVelocidadeMaxima());
                } else if (atleta instanceof AtletaSaltador) {
                    System.out.println("Tipo: Atleta Saltador");
                    System.out.println("Altura Máxima: " + ((AtletaSaltador) atleta).getAlturaMaxima());
                }
                System.out.println("-------------------------");
            }
        }
    }

}
