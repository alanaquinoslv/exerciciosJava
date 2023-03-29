package sptech.atividade02.ac01;

import java.util.Scanner;

/**
 *
 * @author alan
 */
public class TesteCalculoAluno {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a 1ª nota: ");
        Double nota01 = scan.nextDouble();
        System.out.println("Digite a 2ª nota: ");
        Double nota02 = scan.nextDouble();

        UtilCalculoAluno retornoMedia = new UtilCalculoAluno();
        Double media = retornoMedia.calcularMedia(nota01, nota02);

        System.out.println(String.format("Média: %.1f", media));

    }
}
