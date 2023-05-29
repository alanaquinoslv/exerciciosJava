package sptech.metodos;

/**
 *
 * @author alan
 */
public class Calculadora {

//    void somar(Integer numero01, Integer numero02) {
//        System.out.println(numero01 + numero02);
//    }
    //nao fazer print no retorno
    Integer somar(Integer numero01, Integer numero02) {
        return numero01 + numero02;
    }

    Integer somar(Integer numero01, Integer numero02, Integer numero03) {
        return numero01 + numero02 + numero03;
    }

    Boolean isPar(Double numeroVerificar) {
        Boolean isPar = numeroVerificar % 2 == 0;
        return isPar;
    }
}
