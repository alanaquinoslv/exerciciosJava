package sptech.segundo.projeto.nivelamento;

/**
 *
 * @author miniguiti
 */
public class Interpolacao {
    public static void main(String[] args) {
        String nome = "Xampson";
        Integer idade = 42;
        Double altura = 1.56;
        
        // %s --> String
        // %d --> Integer
        // %.3f --> Double (o n° representa as casas decimais)
        
        // Podemos interpolar direto no print
        // Ou guardar a string formatada em uma variável
        String frase =  String.format(
                        "Meu nome é %s, tenho %d anos de idade e %.4f. O nome do meu pet é %s",
                        nome, idade, altura, "Mel");
        

        System.out.println(frase);
    }
}
