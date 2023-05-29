package sptech.segundo.projeto.nivelamento;

/**
 *
 * @author miniguiti
 */
public class Ternario {
    public static void main(String[] args) {
        Boolean bloqueado = true;
        
        String frase;
        if(bloqueado){
            frase = "Usuário Bloqueado!";
        }else{
            frase = "Usuário Desbloqueado";
        }
        
        System.out.println(frase);
        
        frase = bloqueado ? "Usuário Bloqueado" : "Usuário Desbloqueado";
        
        // Não serve somente para boleanos,
        // Cenário: se o salario for maior que 1000.0, o bônus será de 0.5
        // se for menor que 1000.0, o bônus será de 0.2
        
        Double salario = 1075.0;
        
        Double bonus = 0.0;
        if(salario > 1000.0){
            bonus = 0.5;
        }else{
            bonus = 0.2;
        }
        
        bonus = salario > 1000.0 ? 0.5 : 0.2;
    }
}
