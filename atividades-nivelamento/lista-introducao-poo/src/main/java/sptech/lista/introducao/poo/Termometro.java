package sptech.lista.introducao.poo;

/**
 *
 * @author alan
 */
public class Termometro {

    Double temperaturaAtual;
    Double temperaturaMax;
    Double temperaturaMin;

    void aumentaTemperatura(Double aumentoDeTemperatura) {
        if (aumentoDeTemperatura > temperaturaMax) {
            temperaturaMax = aumentoDeTemperatura;
            temperaturaAtual = temperaturaMax;
        } else {
            temperaturaAtual = aumentoDeTemperatura;
        }

        System.out.println(String.format("Temperatura atual: %.1fC° \n"
                + "Temperatura max: %.1fC° \n"
                + "Temperatura min: %.1fC°",
                temperaturaAtual, temperaturaMax, temperaturaMin));
    }

    void diminuiTemperatura(Double diminuicaoDeTemperatura) {
        if (diminuicaoDeTemperatura < temperaturaMin) {
            temperaturaMin = diminuicaoDeTemperatura;
            temperaturaAtual = temperaturaMin;
        } else {
            temperaturaAtual = diminuicaoDeTemperatura;
        }

        System.out.println(String.format("Temperatura atual: %.1fC° \n"
                + "Temperatura max: %.1fC° \n"
                + "Temperatura min: %.1fC°",
                temperaturaAtual, temperaturaMax, temperaturaMin));
    }

    void exibeFahreinheit() {
        Double fahreinheit = (temperaturaAtual * 9 / 5) + 32;

        System.out.println(String.format("Fahreinheit: %.1fF°", fahreinheit));
    }
}
