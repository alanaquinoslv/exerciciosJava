package sptech.primeiro.projeto.nivelamento.ads.b;

import java.util.Scanner;

/**
 *
 * @author miniguiti
 */
public class EscritaLeitura {
    public static void main(String[] args) {
        // Criando um leitor
        // Essa não é uma variável comum, e sim um objeto!!!
        // Pra ser objeto, precisa INSTÂNCIAR (usado new)
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite seu nome: " );
        String nomeDigitado = leitor.nextLine();
        
//        System.out.println("O nome digitado foi: " + nomeDigitado + " :o");
        
        System.out.println("Digite sua altura: ");
        Double alturaDigitada = leitor.nextDouble();
                
//        System.out.println("A altura digitada foi: " + alturaDigitada + " :o");
        
        System.out.println("Digite sua idade: ");
        Integer idadeDigitada = leitor.nextInt();
        
//        System.out.println("A idade digitada foi: " + idadeDigitada);
        
        System.out.println("Meu nome é " + nomeDigitado + 
                " tenho " + idadeDigitada + 
                " anos de idade e " + alturaDigitada + 
                " de altura");
    }
}
