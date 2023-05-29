package sptech.atividade02.ac01;

import java.util.Scanner;

/**
 *
 * @author alan
 */
public class TesteCalculoNutricao {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o peso:");
        Double peso = scan.nextDouble();

        System.out.println("Insira a altura:");
        Double altura = scan.nextDouble();

        UtilCalculoNutricao calculoImc = new UtilCalculoNutricao();

        Double imc = calculoImc.imc(peso, altura);
        System.out.println(String.format("IMC: %.2f", imc));

    }
}
