package sptech.lista.tres;

import java.util.Scanner;

/**
 *
 * @author alan
 */
public class TesteClasseSocial {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite sua renda:");
        Double renda = scan.nextDouble();

        CalculadoraClasseSocial retornoString = new CalculadoraClasseSocial();

        Double salario = retornoString.retornoSalarioMinimo(renda);

        System.out.println(String.format("Você recebe aproximadamente"
                + " %.2f salários mínimos.", salario));
        String classe = retornoString.retornoClasseSocial(salario);
        System.out.println("Classe: " + classe);

    }

}
