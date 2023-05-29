package sptech.lista.introducao.poo;

/**
 *
 * @author alan
 */
public class AppEncomendas {

    public static void main(String[] args) {
        Encomendas encomenda1 = new Encomendas();
        Encomendas encomenda2 = new Encomendas();
        Encomendas encomenda3 = new Encomendas();

        encomenda1.enderecoRemetente = "Rua arroio do sul";
        encomenda1.enderecoDestinatario = "Alameda quatro";
        encomenda1.tamanho = "m";
        encomenda1.valorEncomenda = 32.99;
        encomenda1.distancia = 56.0;

        encomenda2.enderecoRemetente = "Rua arroio do centro-oeste";
        encomenda2.enderecoDestinatario = "Alameda dois";
        encomenda2.tamanho = "p";
        encomenda2.valorEncomenda = 97.0;
        encomenda2.distancia = 10.0;

        encomenda3.enderecoRemetente = "Rua arroio do norte";
        encomenda3.enderecoDestinatario = "Alameda cinco";
        encomenda3.tamanho = "g";
        encomenda3.valorEncomenda = 240.0;
        encomenda3.distancia = 301.0;

        encomenda1.calcularFrete();
        encomenda1.emitirEtiqueta();

        encomenda2.calcularFrete();
        encomenda2.emitirEtiqueta();

        encomenda3.calcularFrete();
        encomenda3.emitirEtiqueta();
    }
}
