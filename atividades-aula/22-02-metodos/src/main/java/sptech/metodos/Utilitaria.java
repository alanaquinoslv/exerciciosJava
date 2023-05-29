package sptech.metodos;

/**
 *
 * @author miniguiti
 */
public class Utilitaria {
    
    //Retorno: esse é void (não tem retorno)
    //Nome: exibirLinha
    //Argumentos: não possui, fica dentro dos ()
    //Corpo: fica dentro das { } 
    void exibirLinha(){
        System.out.println("*----*-----*-----*----*");
    }
    
    void exibirNome(String nome){
        System.out.println("Meu nome é: " + nome);
    }    
   
    // Métodos podem chamar outros métodos:
    // Posso ter métodos diferentes com mesmo nome de argumento
    // Já que a variável do argumento nasce e morre dentro do corpo do método
    void exibirNomeFormatado(String nome){
        exibirLinha();
        exibirNome(nome);
        exibirLinha();
        System.out.println("\n");
    }
    
    
}
