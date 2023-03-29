/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.atividade01.ac01;

import java.util.Scanner;

/**
 *
 * @author alan
 */
public class Calculadora {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número correspondente a opção "
                + "desejada: \n 1-soma \n 2-multiplicação \n 3-divisão \n "
                + "4-subtração \n 5-potência \n 6-resto \n 0-sair");

        Integer opcao = scan.nextInt();

        if (opcao == 0) {
            System.out.println("Até logo!");
        }

        while (opcao != 0) {

            switch (opcao) {
                case 1:
                    System.out.println("Digite um número inteiro");
                    Integer numEscolhidoSoma = scan.nextInt();

                    int contSoma = 0;
                    for (int i = 1; i <= 10; i++) {
                        contSoma += 1;
                        System.out.println(String.format("%d + %d = %d",
                                numEscolhidoSoma, i, (numEscolhidoSoma + contSoma)));
                    }

                    System.out.println("Digite o número correspondente a opção "
                            + "desejada: \n 1-soma \n 2-multiplicação \n 3-divisão \n "
                            + "4-subtração \n 5-potência \n 6-resto \n 0-sair");
                    opcao = scan.nextInt();

                    if (opcao == 0) {
                        System.out.println("Até logo!");
                        break;
                    }

                case 2:
                    System.out.println("Digite um número inteiro:");
                    Integer numEscolhidoMultiplicacao = scan.nextInt();

                    int contMultiplicacao = 0;
                    for (int i = 1; i <= 10; i++) {
                        contMultiplicacao += 1;
                        System.out.println(String.format("%d x %d = %d",
                                numEscolhidoMultiplicacao, i, (numEscolhidoMultiplicacao * contMultiplicacao)));
                    }

                    System.out.println("Digite o número correspondente a opção "
                            + "desejada: \n 1-soma \n 2-multiplicação \n 3-divisão \n "
                            + "4-subtração \n 5-potência \n 6-resto \n 0-sair");
                    opcao = scan.nextInt();

                    if (opcao == 0) {
                        System.out.println("Até logo!");
                        break;
                    }

                case 3:
                    System.out.println("Digite um número inteiro:");
                    Integer numEscolhidoDivisao = scan.nextInt();

                    int contDivisao = 0;
                    for (int i = 1; i <= 10; i++) {
                        contDivisao += 1;
                        System.out.println(String.format("%d ÷ %d = %d",
                                numEscolhidoDivisao, i, (numEscolhidoDivisao / contDivisao)));
                    }

                    System.out.println("Digite o número correspondente a opção "
                            + "desejada: \n 1-soma \n 2-multiplicação \n 3-divisão \n "
                            + "4-subtração \n 5-potência \n 6-resto \n 0-sair");
                    opcao = scan.nextInt();

                    if (opcao == 0) {
                        System.out.println("Até logo!");
                        break;
                    }

                case 4:
                    System.out.println("Digite um número inteiro:");
                    Integer numEscolhidoSubtracao = scan.nextInt();

                    int contSubtracao = 0;
                    for (int i = 1; i <= 10; i++) {
                        contSubtracao += 1;
                        System.out.println(String.format("%d - %d = %d",
                                numEscolhidoSubtracao, i, (numEscolhidoSubtracao - contSubtracao)));
                    }

                    System.out.println("Digite o número correspondente a opção "
                            + "desejada: \n 1-soma \n 2-multiplicação \n 3-divisão \n "
                            + "4-subtração \n 5-potência \n 6-resto \n 0-sair");
                    opcao = scan.nextInt();

                    if (opcao == 0) {
                        System.out.println("Até logo!");
                        break;
                    }

                case 5:
                    System.out.println("Digite um número inteiro:");
                    Integer numEscolhidoPotencia = scan.nextInt();

                    int contPotencia = 0;
                    for (int i = 1; i <= 10; i++) {
                        contPotencia += 1;

                        Double potencia = Math.pow(numEscolhidoPotencia, contPotencia);
                        System.out.println(String.format("%d ^ %d = %.2f",
                                numEscolhidoPotencia, i, potencia));
                    }

                    System.out.println("Digite o número correspondente a opção "
                            + "desejada: \n 1-soma \n 2-multiplicação \n 3-divisão \n "
                            + "4-subtração \n 5-potência \n 6-resto \n 0-sair");
                    opcao = scan.nextInt();

                    if (opcao == 0) {
                        System.out.println("Até logo!");
                        break;
                    }

                case 6:
                    System.out.println("Digite um número inteiro:");
                    Integer numEscolhidoResto = scan.nextInt();

                    int contResto = 0;
                    for (int i = 1; i <= 10; i++) {
                        contResto += 1;
                        System.out.println(String.format("%d / %d = %d",
                                numEscolhidoResto, i, (numEscolhidoResto % contResto)));
                    }

                    System.out.println("Digite o número correspondente a opção "
                            + "desejada: \n 1-soma \n 2-multiplicação \n 3-divisão \n "
                            + "4-subtração \n 5-potência \n 6-resto \n 0-sair");
                    opcao = scan.nextInt();

                    if (opcao == 0) {
                        System.out.println("Até logo!");
                        break;
                    }

            }

        }

    }
}
