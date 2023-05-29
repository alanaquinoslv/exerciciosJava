package sptech.atividade02.ac01;

/**
 *
 * @author alan
 */
public class UtilDescontoProgressivo {

    Double desconto(Double valorUnitario, Integer quantidade) {
        if (quantidade == 1) {
            return quantidade * (valorUnitario - (valorUnitario * 0.1));
        } else if (quantidade == 2) {
            return quantidade * (valorUnitario - (valorUnitario * 0.2));
        } else if (quantidade >= 3) {
            return quantidade * (valorUnitario - (valorUnitario * 0.3));
        }

        return null;
    }

    void exibirNota(Double valorUnitario,
            Integer quantidade,
            Double descontoProgressivo) {
        System.out.println("----------------");
        System.out.println(String.format("Valor do produto: R$ %.2f \n"
                + "Quantidade: %d", valorUnitario, quantidade));
        System.out.println("----------------");
        System.out.println(String.format("Valor com desconto: R$ %.2f", descontoProgressivo));

    }

}
