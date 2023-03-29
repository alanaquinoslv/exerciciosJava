package sptech.atividade02.ac01;

/**
 *
 * @author alan
 */
public class UtilValidacaoNumerica {

    Integer numPrimo(Integer numEscolhido) {
        int divisores = 0;

        for (int i = 1; i <= numEscolhido; i++) {
            if (numEscolhido % i == 0) {
                divisores++;
            }

        }
        if (divisores == 2) {
            System.out.println("É primo");
        } else {
            System.out.println("Não é primo");
        }
        return null;
    }
}
