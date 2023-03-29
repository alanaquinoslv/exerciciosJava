package sptech.atividade02.ac01;

import java.util.Scanner;

/**
 *
 * @author alan
 */
public class TesteValidacaoNumerica {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número positivo:");
        Integer numEscolhido = scan.nextInt();

        do {
            System.out.println("Digite um número positivo:");
            numEscolhido = scan.nextInt();

            UtilValidacaoNumerica testePrimos = new UtilValidacaoNumerica();
            Integer validacaoPrimos = testePrimos.numPrimo(numEscolhido);
            System.out.println(validacaoPrimos);

        } while (numEscolhido > 0);
    }

}
