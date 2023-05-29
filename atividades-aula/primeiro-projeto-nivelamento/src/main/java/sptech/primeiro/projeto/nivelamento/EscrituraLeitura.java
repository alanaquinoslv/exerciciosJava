/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.primeiro.projeto.nivelamento;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class EscrituraLeitura {
    public static void main(String[] args) {
        //criando um leitor 
        // essa não é uma variavel comum, e sim um objeto
        //pra ser objeto, precisa instanciar
        // sempre que tiver 'new' não é mais uma classe, é um objeto do tipo scanner
        Scanner leitor  = new Scanner (System.in);
        System.out.println("Digite seu nome: ");
        
        String nomeDigitado =  leitor.nextLine();
        System.out.println("O nome digitado foi:  " + nomeDigitado  );
        System.out.println("Digite sua altura: " );
        
        Double alturaDigitada = leitor.nextDouble();
        System.out.println("O altura digitada  foi:  " + alturaDigitada  );
        
        System.out.println("Digite sua idade:  ");
        Integer idadeDigitada = leitor.nextInt();
        
        System.out.println("Meu nome é " + nomeDigitado  + " Tenho " + idadeDigitada + " anos de idade " +
                " e tenho " + alturaDigitada + "de altura");
        
    }
    
}
