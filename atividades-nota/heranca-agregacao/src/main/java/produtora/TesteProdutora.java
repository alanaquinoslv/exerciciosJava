package produtora;

/**
 *
 * @author alan
 */
public class TesteProdutora {

    public static void main(String[] args) {
        Ator ator01 = new Ator("Antonio", 120,
                2000.0);
        Ator ator02 = new Ator("Vin Diesel", 120,
                2000.0);
        Ator ator03 = new Ator("Oprah", 120,
                2000.0);
        Protagonista protagonista01 = new Protagonista(30,
                5000.0, "Giuseppe",
                100, 3400.0);
        Protagonista protagonista02 = new Protagonista(60,
                5000.0, "Dwayne",
                440, 4500.0);
        Protagonista protagonista03 = new Protagonista(100,
                10000.0, "Ayrton",
                200, 1200.0);

        Produtora produtora = new Produtora("Rockfeller", 3);
        produtora.contratar(ator03);
        produtora.contratar(ator02);
        produtora.contratar(protagonista03);
        //produtora.contratar(protagonista01);
        System.out.println(produtora.existePorNome("giuseppe"));
        System.out.println(produtora.existePorNome("AYRTON"));
        System.out.println("Atores: " + produtora.getQuantidadeAtores());
        System.out.println("Protagonistas: " + produtora.getQuantidadeProtagonistas());
        System.out.println("Total de salários: R$" + produtora.getTotalSalarios());
        System.out.println(produtora.buscarAtorPorNome("antonio"));
        System.out.println(produtora.buscarAtorPorNome("vin diesel"));
    }

}
