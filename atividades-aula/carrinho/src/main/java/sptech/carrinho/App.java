package sptech.carrinho;

/**
 *
 * @author alan
 */
public class App {

    public static void main(String[] args) {
        Produto produto01 = new Produto("Ryzen 7 5700x", "CPU", 1100.00);
        Produto produto02 = new Produto("Ryzen 5 5600", "CPU", 550.00);
        Produto produto03 = new Produto("Ryzen 7 5800X3D", "CPU", 1800.00);
        Produto produto04 = new Produto("Logitech G733", "Headset", 1000.00);
        Produto produto05 = new Produto("Logitech G535", "Headset", 750.00);
        Produto produto06 = new Produto("Asgard 8gb", "Memoria", 100.00);
        Produto produto07 = new Produto("Corsair Vengeance 16gb", "Memoria", 350.00);
        Produto produto08 = new Produto("Silencio S400", "Gabinete", 850.00);

        Carrinho carrinho01 = new Carrinho("Alan");
        Carrinho carrinho02 = new Carrinho("Maria");

        carrinho01.adicionar(produto01);
        carrinho01.adicionar(produto08);
        carrinho01.adicionar(produto04);
        carrinho01.adicionar(produto07);
        carrinho01.adicionar(produto02);


        carrinho02.adicionar(produto03);
        carrinho02.adicionar(produto05);
        carrinho02.adicionar(produto06);

        System.out.println(carrinho01.getQuantidade());
        System.out.println(carrinho01.existsPorNome("Ryzen 7 5700x"));
        System.out.println(carrinho01.getQuantidadePorCategoria("cpu"));
        carrinho01.removerPorNome("Corsair Vengeance 16gb");
        System.out.println(carrinho01.getPorNome("Logitech G733"));
        System.out.println(carrinho01.getValorTotal());
        carrinho01.limpar();
        System.out.println(carrinho01);
    }
}
