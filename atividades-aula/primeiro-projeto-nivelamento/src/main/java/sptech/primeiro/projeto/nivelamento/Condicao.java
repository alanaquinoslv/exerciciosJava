/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.primeiro.projeto.nivelamento;

/**
 *
 * @author Dell
 */
public class Condicao {
    public static void main(String[] args) {
        
        // > maior
        // < menor
        // || ou 
        // && e
        // >= maior igual 
        // <= menor igual 
        // != diferente de 
        
        Integer numero01 = 10;
        Integer numero02 = 10;
        
        if(numero01 > numero02) {
            System.out.println("È maior!");
        } else if (numero01 < numero02) {
            System.out.println("È menor!");
        } else {
            System.out.println("È igual!");
        }
        
        String nome1 = "Xampson";
        String nome2 = "xampson";
        
        //SENSitive case 
        if  (nome1.equals(nome2)) {
            System.out.println("È o mesmo nome.");
        } else {
            System.out.println("Não é o mesmo nome.");
        }
        //INsensitive case
        if  (nome1.equalsIgnoreCase(nome2)) {
            System.out.println("È o mesmo nome.");
        } else {
            System.out.println("Não é o mesmo nome.");
        }
        
        //comparação de booleanos 
        Boolean bloqueado = true;
        if (bloqueado) {
            System.out.println("Ta bloqueado");
        } else { 
            System.out.println("Ta desbloqueado");
        }
    }
}
