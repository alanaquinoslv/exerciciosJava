package sptech.metodos;

/**
 *
 * @author miniguiti
 */
public class Teste {
    public static void main(String[] args) {
        
        // Criar um objeto da Utilitaria
        // Fazer uma instância para usar os métodos
        Utilitaria util = new Utilitaria();
        
        String nome01 = "Xampson";
        String nome02 = "Giuliana";
        
        //Chamando um método = invocando um método (invocação do bem)
        util.exibirNomeFormatado(nome01);
        util.exibirNomeFormatado(nome02);
        
        Calculadora calc = new Calculadora();
        
        Integer soma = calc.somar(10,32);
        calc.somar(1, 3);
        System.out.println("Soma: " + soma);
           
        //Só é possível porque guardei o retorno em uma variável:
        System.out.println("Soma + 10 :" + (soma + 10));
        
        System.out.println(
                String.format(
                        "Soma com interpolação: %d"
                        , soma)
        );
        
        //Soma com sobrecarga
        Integer soma3numeros = 
                calc.somar(10, 15,1);
    }
}
