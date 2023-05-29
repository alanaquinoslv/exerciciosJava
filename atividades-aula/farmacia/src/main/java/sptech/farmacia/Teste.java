package sptech.farmacia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author alan
 */
public class Teste {

    public static void main(String[] args) {
        List<Medicamento> medicamentos = new ArrayList();
        Scanner scan = new Scanner(System.in);
        Scanner scanNl = new Scanner(System.in);
        Integer opcao = 0;
        Integer id = 1;

        while (opcao != 4) {
            System.out.println(String.format("\n1 - Cadastrar medicamento \n"
                    + "2 - Exibir medicamentos \n"
                    + "3 - Buscar medicamento por nome \n"
                    + "4 - Sair \n"));

            opcao = scan.nextInt();

            switch (opcao) {
                case 4:
                    System.out.println("\n Obrigado por utilizar!");
                    break;

                case 1:
//                    System.out.println("Insira o ID do medicamento:");;

                    System.out.println("Insira o nome do medicamento:");
                    String nomeMed = scanNl.nextLine();
                    System.out.println("Insira a quantidade em estoque:");
                    Integer qtdEstoque = scan.nextInt();
                    System.out.println("Insira o valor de venda:");
                    Double valorVenda = scan.nextDouble();

                    Medicamento med = new Medicamento(id, nomeMed, qtdEstoque, valorVenda);
                    medicamentos.add(med);
                    id++;
                    break;

                case 2:
                    System.out.println("Medicamentos em estoque:");
                    for (Medicamento medicamento : medicamentos) {
                        System.out.println("----------------- \n"
                                + medicamento
                                + "----------------- \n");
                    }
                    break;

                case 3:
                    System.out.println("Digite o nome do medicamento desejado:");
                    String medicamentoPesquisado = scanNl.nextLine();
                    Boolean medicamentoEncontrado = false;

                    for (Medicamento medicamento : medicamentos) {
                        if (medicamento.getNomeMedicamento().equalsIgnoreCase(medicamentoPesquisado)) {
                            System.out.println("----------------- \n"
                                    + medicamento
                                    + "----------------- \n");
                            medicamentoEncontrado = true;
                        }

                    }
                    if (!medicamentoEncontrado) {
                        System.out.println("\nMedicamento não encontrado.");
                    }
                    break;

                default:
                    System.out.println("Insira uma opção válida.");
                    ;
            }
        }

    }
}
