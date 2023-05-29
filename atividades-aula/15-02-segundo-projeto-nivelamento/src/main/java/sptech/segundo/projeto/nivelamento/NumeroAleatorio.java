package sptech.segundo.projeto.nivelamento;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author miniguiti
 */
public class NumeroAleatorio {
    public static void main(String[] args) {
        // Da pra fazer usando essa classe
        // Math.random
        // Mas precisa criar objeto, tipo Scanner
        
        Integer numeroSorteado = 
                ThreadLocalRandom.current().nextInt(1, 101);
        
        System.out.println("Número sorteado: " + numeroSorteado);
        
        Double valorInicial = 1.3;
        System.out.println("Número Double sorteado: "+ 
                ThreadLocalRandom.current().nextDouble(valorInicial, 54.7));
        
        
    }
}
