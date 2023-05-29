/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.segundo.projeto.nivelamento;

/**
 *
 * @author alan
 */
public class Interpolacao {
    public static void main(String[] args) {
        String nome = "Xampson";
        Integer idade = 43;
        Double altura = 1.55;
        
        // %s = string
        // %d = inteiros
        // %.2f = float
        
        System.out.println(String.format ("Meu nome é %s, tenho %d " + 
                "anos de idade e %.2f", nome, idade, altura));

        String frase = String.format("Meu nome é %s, tenho %d anos "
                + "de idade e %.4f", nome, idade, altura);
        
        System.out.println(frase);
    }   
}
