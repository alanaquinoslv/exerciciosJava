/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.segundo.projeto.nivelamento;

import java.util.Scanner;

/**
 *
 * @author alan
 */
public class SwitchCase {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número que corresponde a "
                + "um dia da semana:");

        Integer diaDigitado = leitor.nextInt();
        switch (diaDigitado) {
            case 1:
                System.out.println("Segundou!");
                break;
            case 2:
                System.out.println("Terçou!");
                break;
            case 3:
                System.out.println("Quartou!");
                break;
            case 4:
                System.out.println("Quintou!");
                break;
            case 5:
                System.out.println("Sextou!");
                break;
            case 6:
                System.out.println("Sábadou!");
                break;
            case 7:
                System.out.println("Domingou!");
                break;
            default:
                System.out.println("Dia inválido.");
                break;
        }
    }
}
