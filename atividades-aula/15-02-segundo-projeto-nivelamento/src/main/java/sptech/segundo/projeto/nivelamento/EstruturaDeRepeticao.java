package sptech.segundo.projeto.nivelamento;

import java.util.Scanner;

/**
 *
 * @author miniguiti
 */
public class EstruturaDeRepeticao {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("for de 0 a 10");        
        for(int i = 0; i <= 10; i++){
            System.out.println(i);
        }
        
        System.out.println("for 10 a 0");
        for(int i = 10; i >= 0; i--){
            System.out.println(i);
        }
        
        System.out.println("while 0 a 10");
        
        // Assim precisamos lembrar de criar o i e alterar dentro do while
        // Risco de loop infinito x_x
        int i = 0;
        while(i <= 10){
            System.out.println(i);
            i++;
        }
        
        // Usar while é melhor quando não sabemos a condição de parada!
        
        System.out.println("while - adivinhe o número");
        
        System.out.println("Digite um número:");
        Integer numeroDigitado = leitor.nextInt();
        
        while(numeroDigitado != 42){
            System.out.println("Adivinhe o número:");
            numeroDigitado = leitor.nextInt();
        }
        
        System.out.println("Acertou!");
        
        System.out.println("do while - adivinhe o número");
        
        // O que fica dentro do "do" roda sempre uma primeira vez!
        
        // Essas duas linhas agora são redundantes
        //System.out.println("Digite um número");
        //numeroDigitado = leitor.nextInt();
        
        do {            
            System.out.println("Adivinhe o número:");
            numeroDigitado = leitor.nextInt();
        } while (numeroDigitado != 42);
    }
}
