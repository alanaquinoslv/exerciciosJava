package sptech.lista.tres;

/**
 *
 * @author alan
 */
public class CalculadoraClasseSocial {

    Double retornoSalarioMinimo(Double renda) {
        return renda / 1045;
    }

    String retornoClasseSocial(Double renda) {

        if (renda <= 2) {
            return "E";
        } else if (renda <= 4) {
            return "D";
        } else if (renda <= 10) {
            return "C";
        } else if (renda <= 20) {
            return "B";
        } else if (renda > 20) {
            return "A";
        }

        return null;
    }

}
