package sptech.atividade02.ac01;

import java.util.Scanner;

/**
 *
 * @author alan
 */
public class TesteDescontoProgressivo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Bem vindo ao desconto progressivo! \n \n"
                + "Digite o valor unitário do produto:");
        Double valorUnitario = scan.nextDouble();

        System.out.println("Digite a quantidade: ");
        Integer quantidade = scan.nextInt();

        UtilDescontoProgressivo desconto = new UtilDescontoProgressivo();
        Double descontoProgressivo = desconto.desconto(valorUnitario, quantidade);

        desconto.exibirNota(valorUnitario, quantidade, descontoProgressivo);
    }
}
