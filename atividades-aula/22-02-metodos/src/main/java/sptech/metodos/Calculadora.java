package sptech.metodos;

/**
 *
 * @author miniguiti
 */
public class Calculadora {
    
    // Não fazer print do retorno
    // Você pode se confundir
    // e esquecer de usar o retorno na classe que chama o método
    Integer somar(Integer numero01, Integer numero02){
        return numero01 + numero02;
    }
    
    // Quando for necessário fazer um print dentro do método
    // Usar um nome que ajude a entender, por exemplo:
    void exibirSoma(Integer numero01, Integer numero02){
        System.out.println(numero01 + numero02);
    }
    
    // Sobrecarga do método somar
    // O mesmo método com argumentos diferentes
    Integer somar(Integer numero01, Integer numero02, Integer numero03){
        return numero01 + numero02 + numero03;
    }
    
    // Pode ter mais de uma sobrecarga:
    Integer somar(String usuarioSolicitante, 
                        Integer numero01, 
                        Integer numero02, 
                        Integer numero03, 
                        Integer numero04){
        System.out.println(usuarioSolicitante + " pediu para somar");
        return numero01 + numero02 + numero03;
    }
    
    //Método que retorna boleano:
    Boolean isPar(Double numeroVerificar){
        Boolean isPar; 
        if(numeroVerificar % 2 == 0){
            isPar = true;
        }else{
            isPar = false;
        }
        
        // Assim também funciona:
        // isPar = numeroVerificar % 2 == 0;
        
        // Assim também (só com uma linha):
        // return numeroVerificar % 2 == 0;
        
        return isPar;
    }
}
