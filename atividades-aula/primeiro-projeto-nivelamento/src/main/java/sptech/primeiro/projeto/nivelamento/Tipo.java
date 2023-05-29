package sptech.primeiro.projeto.nivelamento;


import sptech.primeiro.projeto.nivelamento.Operador;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Dell
 */
public class Tipo {

    public static void main(String[] args) {
        //tipos que mais usaremos:
        //01 numeros inteiros: -> interger

        //declarando e inicializando
        Integer idade = 21;
        //só declarar
        Integer numeroQualquer;
        //só inicializa 
        numeroQualquer = 10;

        //02 numeros quebrados -> double 
        Double altura = 1.73;

        //03 para palavras -> string 
        String nome = "Alan";
        System.out.println("Meu nome é " + nome + "\n tenho " + idade
                + " anos de idade, e " + altura + " de altura");

        // tipos primitivos e tipos Wrapper
        // para inteiros 
        int inteiroPrimitivo; // começa com zero
        Integer inteiroWrapper; // se nao iniciar começa com null
        boolean booleanoprimitivo;
        Boolean booleanoWrapper;

        //classes possuem metodos e eles vao ajudar 
        //tipos primitivos nao
        //uma variavael da classe integer
        Integer valorMaximoInteiro = Integer.MAX_VALUE;
        System.out.println("O máximo do Integer é: " + valorMaximoInteiro);

        //operador
        Operador.main(args);
        Integer numero01 = 10;
        Integer numero02 = 10;

        //01 soma
        //exibindo com uma variavel 
        Integer soma = numero01 + numero02;
        //somando direto no print
        System.out.println("soma: " + soma);
        System.out.println("soma: " + (numero01 + numero02));

        //02 multiplicacao 
        System.out.println("multiplicação: " + (numero01 * numero02));
        //03 divisao
        System.out.println("divisao: " + (numero01 / numero02));
        //04 subtração
        System.out.println("subtração: " + (numero01 - numero02));

        //** usado para potencia nao existe no java
        // tem uma classe especifica para isso
        //05 potencia
        System.out.println("potencia: " + (Math.pow(2, 5)));
        //06 pi
        System.out.println("valor de pi: " + Math.PI);
        //07 resto de divisao
        System.out.println("resto: " + (numero01 % numero02));

        //08 add numero
        System.out.println("valor + 1: " + ++numero01);
        System.out.println("valor - 1: " + --numero02);

        //09 soma de variaveis
        numero01 += 20;
        System.out.println(numero01);

    }
}
