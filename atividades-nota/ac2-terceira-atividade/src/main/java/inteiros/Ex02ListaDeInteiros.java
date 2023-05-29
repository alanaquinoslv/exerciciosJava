package inteiros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author alan
 */
public class Ex02ListaDeInteiros {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> listaNumeros = new ArrayList();
        List<Integer> listaPares = new ArrayList<>();
        List<Integer> listaImpares = new ArrayList<>();

        Integer numeroDigitado;
        Integer soma = 0;
        Integer menorNumero = 999999999;
        Integer maiorNumero = 0;

        do {
            System.out.println("Digite números inteiros:");
            numeroDigitado = scan.nextInt();

            if (numeroDigitado > 0) {
                listaNumeros.add(numeroDigitado);
            } else {
                break;
            }

            if (numeroDigitado > maiorNumero) {
                maiorNumero = numeroDigitado;
            }

            if (numeroDigitado < menorNumero) {
                menorNumero = numeroDigitado;
            }

            soma += numeroDigitado;

        } while (numeroDigitado != 0);

        for (Integer numeroPar : listaNumeros) {
            if (numeroPar % 2 == 0) {
                listaPares.add(numeroPar);
            }
        }

        for (Integer numeroImpar : listaNumeros) {
            if (numeroImpar % 2 != 0) {
                listaImpares.add(numeroImpar);
            }
        }

        System.out.println("Números pares: " + listaPares);
        System.out.println("Números pares: " + listaImpares);
        System.out.println("Maior número: " + maiorNumero);
        System.out.println("Menor número: " + menorNumero);
        System.out.println("Soma dos números = " + soma);

    }
}
