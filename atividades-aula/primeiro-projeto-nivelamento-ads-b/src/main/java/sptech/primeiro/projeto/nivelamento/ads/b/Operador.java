package sptech.primeiro.projeto.nivelamento.ads.b;

/**
 *
 * @author miniguiti
 */
public class Operador {
    public static void main(String[] args) {
        
        // + Soma
        // - Subtração
        // / Divisão
        // * Multiplicação
        // % Resto da divisão
        // ++ Soma 1
        // -- Subtrai 1
        // += soma o que já tem 
        // -= subtrai o que já tem 
        // *= multiplica o que já tem 
        // Math.pow(a,b) Potência !Só esse muda do JS pro Java
        
        Integer numero01 = 10;
        Integer numero02 = 10;
        
        // 01) Soma
        // Exibindo com uma variável
        Integer soma = numero01 + numero02;        
        System.out.println("Soma: " + soma);
        // Somando direto no print
        System.out.println("Soma: " + (numero01 + numero02));
        
        // 02) Multiplicação
        System.out.println("Multiplicação: " + (numero01 * numero02));
        
        // 03) Divisão
        System.out.println("Divisão: " + (numero01 / numero02));
        
        // 04) Subtração
        System.out.println("Subtração: " + (numero01 - numero02));
        
        // 05) Resto
        System.out.println("Resto: " + (numero01 % numero02));
        
        // 06) Somando e Subtraindo1
        System.out.println("Valor + 1: " + (++numero01));
        
        Integer numeroSubtraido = --numero02;
        System.out.println("Valor - 1: " + numeroSubtraido);
        
        // O operador ** usado para potencia no JS não tem no Java!!!
        // Mas temos uma classe com um método que faz isso :)        
        Double potencia = Math.pow(2, 5);
        
        System.out.println("Potência no Java: " 
                + potencia);        
        
        
        // Essa classe, além de métodos tem variáveis que ajudam!
        System.out.println("Valor de PI: " + Math.PI);
    }
}
