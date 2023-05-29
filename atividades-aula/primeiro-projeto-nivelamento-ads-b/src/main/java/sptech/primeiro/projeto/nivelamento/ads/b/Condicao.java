package sptech.primeiro.projeto.nivelamento.ads.b;

/**
 *
 * @author miniguiti
 */
public class Condicao {
    public static void main(String[] args) {
      
        // > maior
        // < menor
        // || ou
        // && e
        // >= maior igual
        // <= menor igual
        // != diferente de    
        // .equals comparar se é igual
        
        Integer numero01 = 10;
        Integer numero02 = 42;
        
        if(numero01 > numero02){
            System.out.println("É maior!");
        }else if(numero01 < numero02){
            System.out.println("É menor");
        }else if(numero01.equals(numero02)){
            System.out.println("É igual");
        }
        
        String nome1 = "Xampson";
        String nome2 = "xampson";
        
        //SENsitive case
        if(nome1.equals(nome2)){
            System.out.println("É o mesmo nome!");
        }else{            
            System.out.println("Não é o mesmo nome!");
        }
        
        //INsensitive case
        if(nome1.equalsIgnoreCase(nome2)){
            System.out.println("É o mesmo nome!");
        }else{            
            System.out.println("Não é o mesmo nome!");
        }
        
        //Comparação de booleanos
        
        Boolean bloqueado = false;// vai vir do banco
        
        if(bloqueado){
            System.out.println("Ta bloqueado!");
        }else{
            System.out.println("Ta desbloqueado!");
        }
       
        // Cuidado com nome de boleano
        // imagina com nome bloqueadoOuNao x_x
    }
}
