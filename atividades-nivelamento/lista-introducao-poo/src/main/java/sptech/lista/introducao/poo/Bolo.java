package sptech.lista.introducao.poo;

/**
 *
 * @author alan
 */
public class Bolo {

    String sabor;
    Double valor;
    Integer qtdVendida;

    void comprarBolo(Integer qtdCompra) {
        Integer quantidadesSomadas = (qtdCompra + qtdVendida);

        if (quantidadesSomadas > 100) {
            System.out.println("Seu pedido ultrapassou nosso limite diário"
                    + " para esse bolo.");
        } else {
            qtdVendida += qtdCompra;
        }
    }

    void exibirRelatorio() {
//        System.out.println("O sabor " + sabor + " foi comprado " + qtdVendida
//                + " vezes hoje, totalizando R$" + (valor * qtdVendida));

        System.out.println(String.format("O bolo sabor %s, foi comprado "
                + "%d vezes hoje, totalizando R$%.2f",
                sabor, qtdVendida, (qtdVendida * valor)));
    }

}
