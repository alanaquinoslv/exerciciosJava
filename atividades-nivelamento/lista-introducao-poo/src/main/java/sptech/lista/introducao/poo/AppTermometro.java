package sptech.lista.introducao.poo;

/**
 *
 * @author alan
 */
public class AppTermometro {

    public static void main(String[] args) {
        Termometro t1 = new Termometro();
        Termometro t2 = new Termometro();
        Termometro t3 = new Termometro();

        t1.temperaturaAtual = 20.0;
        t1.temperaturaMax = 24.0;
        t1.temperaturaMin = 18.0;

        t1.aumentaTemperatura(23.0);
        t1.exibeFahreinheit();

        t2.temperaturaAtual = 35.0;
        t2.temperaturaMax = 41.0;
        t2.temperaturaMin = 28.0;

        t2.diminuiTemperatura(25.4);
        t2.exibeFahreinheit();

        t3.temperaturaAtual = -5.0;
        t3.temperaturaMax = 0.0;
        t3.temperaturaMin = -12.3;
        t3.exibeFahreinheit();

    }
}
