package school.sptech.projeto1.heranca;

/**
 *
 * @author alan
 */
public class Teste {
    public static void main(String[] args) {
        Produto produto01 = new Produto(1, "Açucar", "Alimento", 5.99);
        Produto produto02 = new Produto(2, "Feijão", "Alimento", 8.99);
        Produto produto03 = new Produto(3, "Chinelo", "Vestuário", 32.99);
        
        ProdutoInternacional produtoInt01 = new ProdutoInternacional
        (1, "Gellatto", "Alimento", 45.50);
        ProdutoInternacional produtoInt02 = new ProdutoInternacional
        (2, "Tomato Juice", "Alimento", 25.00);
        ProdutoInternacional produtoInt03 = new ProdutoInternacional
        (3, "Laptop", "Eletrônico", 5000.00);
        
        Carrinho carrinho01 = new Carrinho();
        
        carrinho01.adicionarProduto(produto03);
        carrinho01.adicionarProduto(produto02);
        carrinho01.adicionarProduto(produtoInt03);
        
        carrinho01.removerProduto(1);
        System.out.println(carrinho01.calcularTotal());
        System.out.println(carrinho01.parcelarCompra(3));
    }
}
