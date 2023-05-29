package sptech.primeiro.projeto.nivelamento.ads.b;

/**
 *
 * @author miniguiti
 */
public class Tipo {
    public static void main(String[] args) {
        // Os tipos que mais usaremos:
        
        // 01) Números inteiros -> Integer
        
        // Declarando E Inicializando
        Integer idade = 42;
        
        // Só declarar
        Integer numeroQualquer;
        
        // Só inicializar
        numeroQualquer = 10;
        
        // 02) Números quebrados -> Double
        Double altura = 1.60;
        
        // 03) Para palavras -> String
        String nome = "Xampson";
        
        // \n para quebra de linha
        System.out.println("Meu nome é " + nome + "\n tenho " 
                + idade + " anos de idade e " 
                + altura + " de altura");
        
        // Tipos primitivos e tipos Wrapper
        // Para inteiros
        
        // Primitivo sempre tem um valor se não foi inicializado
        int inteiroPrimitivo;
        Integer inteiroWrapper;
        
        boolean boleanoPrimitivo;
        Boolean boleanoWrapper;
        
        // Classes possuem métodos! e eles vão ajudar
        // Tipos primitivos não  :(
        // boleanoPrimitivo.
        // boleanoWrapper.

        // Uma variável da classe Integer
        Integer valorMaxInteiro = Integer.MAX_VALUE;
        System.out.println("O Máximo de integer é: " + valorMaxInteiro);       
       
    }
    
}
