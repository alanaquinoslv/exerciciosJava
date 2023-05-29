package sptech.atividade02.ac01;

import java.util.Scanner;

/**
 *
 * @author alan
 */
public class TesteIdade {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira sua idade:");
        Integer idade = scan.nextInt();

        UtilIdade faseDaVida = new UtilIdade();

        faseDaVida.classificaIdade(idade);
    }
}
