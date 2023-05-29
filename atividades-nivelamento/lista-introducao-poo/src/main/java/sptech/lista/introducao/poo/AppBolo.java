package sptech.lista.introducao.poo;

/**
 *
 * @author alan
 */
public class AppBolo {

    public static void main(String[] args) {
        Bolo bolo1 = new Bolo();
        Bolo bolo2 = new Bolo();
        Bolo bolo3 = new Bolo();

        bolo1.sabor = "Morango";
        bolo1.valor = 35.0;
        bolo1.qtdVendida = 0;

        bolo2.sabor = "Chocolate";
        bolo2.valor = 45.0;
        bolo2.qtdVendida = 0;

        bolo3.sabor = "Abacaxi";
        bolo3.valor = 40.0;
        bolo3.qtdVendida = 0;

        bolo1.comprarBolo(12);
        bolo1.comprarBolo(22);
        bolo1.comprarBolo(17);
        bolo1.exibirRelatorio();

        bolo2.comprarBolo(99);
        bolo2.comprarBolo(2);
        bolo2.exibirRelatorio();

        bolo3.comprarBolo(36);
        bolo3.exibirRelatorio();
    }

}
