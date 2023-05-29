package sptech.metodos;

/**
 *
 * @author alan
 */
public class Teste {

    public static void main(String[] args) {
        //criar objeto utilitaria
        // fazer uma instancia

        Utilitaria util = new Utilitaria();

        String nome01 = "Xampson";
        String nome02 = "Alan";

//        util.exibirLinha();
//        util.exibirNome(nome01);
//        util.exibirLinha();
//
//        util.exibirLinha();
//        util.exibirNome(nome02);
//        util.exibirLinha();
        util.exibirNomeFormatado(nome02);
        util.exibirNomeFormatado(nome01);
        util.exibirLinha();

        Calculadora calc = new Calculadora();

        System.out.println("soma: " + calc.somar(40, 84));

        //soma com sobrecarga
        // o mesmo metodo com argumentos diferentes
        Integer soma3numeros = calc.somar(5, 15, 1);
        

    }
}
