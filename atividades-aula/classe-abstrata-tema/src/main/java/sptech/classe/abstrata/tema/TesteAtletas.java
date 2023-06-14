package sptech.classe.abstrata.tema;

import java.util.Scanner;

/**
 *
 * @author alan
 */
public class TesteAtletas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMENU");
            System.out.println("1. Treinar Atleta Corredor");
            System.out.println("2. Treinar Atleta Saltador");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    treinarAtletaCorredor();
                    break;
                case 2:
                    treinarAtletaSaltador();
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private static void treinarAtletaCorredor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do atleta corredor: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a idade do atleta corredor: ");
        int idade = scanner.nextInt();
        System.out.print("Digite a velocidade máxima do atleta corredor: ");
        int velocidadeMaxima = scanner.nextInt();

        AtletaCorredor atleta = new AtletaCorredor(nome, idade, velocidadeMaxima);
        atleta.treinar();
        System.out.println("Nome: " + atleta.getNome());
        System.out.println("Idade: " + atleta.getIdade());
        System.out.println("Velocidade Máxima: " + atleta.getVelocidadeMaxima());
    }

    private static void treinarAtletaSaltador() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do atleta saltador: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a idade do atleta saltador: ");
        int idade = scanner.nextInt();
        System.out.print("Digite a altura máxima do atleta saltador: ");
        double alturaMaxima = scanner.nextDouble();

        AtletaSaltador atleta = new AtletaSaltador(nome, idade, alturaMaxima);
        atleta.treinar();
        System.out.println("Nome: " + atleta.getNome());
        System.out.println("Idade: " + atleta.getIdade());
        System.out.println("Altura Máxima: " + atleta.getAlturaMaxima());
    }
}
