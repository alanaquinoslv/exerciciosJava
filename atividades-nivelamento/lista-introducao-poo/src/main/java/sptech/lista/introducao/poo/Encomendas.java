package sptech.lista.introducao.poo;

/**
 *
 * @author alan
 */
public class Encomendas {

    String tamanho;
    String enderecoRemetente;
    String enderecoDestinatario;
    Double distancia;
    Double valorEncomenda;
    Double valorFrete = 0.0;
    Double valorTotal;

    public void calcularFrete() {

        switch (tamanho) {
            case "p":
                valorFrete += (valorEncomenda * 0.1);
                break;
            case "m":
                valorFrete += (valorEncomenda * 0.3);
                break;
            case "g":
                valorFrete += (valorEncomenda * 0.5);
                break;
            default:
                break;
        }

        if (distancia <= 50) {
            valorFrete += 3.0;
        } else if (distancia > 50 && distancia <= 200) {
            valorFrete += 5.0;
        } else if (distancia > 200) {
            valorFrete += 7.0;
        }
    }

    public void emitirEtiqueta() {
        valorTotal = (valorEncomenda + valorFrete);

        System.out.println(String.format("***** ETIQUETA PARA ENVIO ***** \n"
                + "Endereço do remetente: %s \n"
                + "Endereço do destinatário: %s \n"
                + "Tamanho: %s \n"
                + "------------------------------ \n"
                + "Valor encomenda: R$%.2f \n"
                + "Valor frete: R$%.2f \n"
                + "------------------------------ \n"
                + "Valor total: R$%.2f \n"
                + "------------------------------ ", enderecoRemetente,
                enderecoDestinatario, tamanho, valorEncomenda,
                valorFrete, valorTotal));
    }

}
