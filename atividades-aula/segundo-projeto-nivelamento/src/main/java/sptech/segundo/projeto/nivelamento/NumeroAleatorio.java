/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.segundo.projeto.nivelamento;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author alan
 */
public class NumeroAleatorio {
    public static void main(String[] args) {
        //Math.random
        // da pra fazer usando essa classe, mas precisa criar objeto like scan
        
        Integer numeroSorteado = ThreadLocalRandom.current().nextInt();
        
        Integer numeroSorteadoLimite = ThreadLocalRandom.current().nextInt(1,101);
        
        System.out.println("Número sorteado:" + numeroSorteado);
        System.out.println("Número sorteado:" + numeroSorteadoLimite);
        System.out.println("Número sorteado:" + ThreadLocalRandom.current().nextDouble(1.3,77.6));
        
    }
}
