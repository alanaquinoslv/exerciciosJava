package school.sptech.projeto1.heranca;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    List<Produto> produtos;

    public Carrinho() {
        this.produtos = new ArrayList<>();
    }

    /**
     * Adiciona um Produto novo no carrinho. Caso o valor seja null o Produto
     * não deve ser adicionado
     *
     * Parâmetro produto: Novo Produto a ser adicionado
     */
    public void adicionarProduto(Produto produto) {
        if (produto == null) {
            return;
        } else {
            produtos.add(produto);
        }
    }

    /**
     * Remove um Produto do carrinho pelo índice. Caso o índice do produto for
     * inválido o método não deve lançar um erro de execução
     *
     * Parâmetro indice: Índice do Produto que será removido
     */
    public void removerProduto(int indice) {
        for (int i = 0; i < produtos.size(); i++) {
            if (i == indice) {
                produtos.remove(i);
            }
        }
    }

    /**
     * Calcula o valor total de todos os itens do carrinho.
     *
     * Retorna valor total do carrinho
     */
    public Double calcularTotal() {
        Double valorTotal = 0.0;

        for (int i = 0; i < produtos.size(); i++) {
            valorTotal += produtos.get(i).getPreco();
        }

        return valorTotal;
    }

    /**
     * Calcula o valor das parcelas de acordo com o número de vezes que o
     * usuário deseja parcelar.
     *
     * Parâmetro vezes: Número de vezes que o usuário deseja parcelar Retorna
     * total do carrinho parcelado
     */
    public Double parcelarCompra(Integer vezes) {
        Double valorParcela = 0.0;
        Double valorTotal = 0.0;

        for (int i = 0; i < produtos.size(); i++) {
            valorTotal += produtos.get(i).getPreco();
        }

        for (int i = 0; i < produtos.size(); i++) {

            valorParcela = (valorTotal / vezes);
        }
        return valorParcela;
    }

    /**
     * Encontra um Produto com o índice desejado. Caso o índice não seja
     * encontrado retorne null
     *
     * Parâmetro index: Índice do Produto Retorna Produto encontrado
     */
    public Produto findProdutoPeloIndice(Integer index) {
        for (int i = 0; i < produtos.size(); i++) {
            if (i == index) {
                return produtos.get(i);
            }
        }
        return null;
    }

    /**
     * Encontra um Produto com o nome desejado ignorando letras maiúsculas e
     * minúsculas.
     *
     * Caso um Produto não seja encontrado retorne null
     *
     * Parâmetro nome: Nome do Produto Retorna Produto encontrado
     */
    public Produto findProdutoPeloNome(String nome) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getNome().equalsIgnoreCase(nome)) {
                return produtos.get(i);
            }
        }
        return null;
    }

    /**
     * Encontra todos os Produto de uma determinada categoria ignorando letras
     * maiúsculas e minúsculas.
     *
     * Caso não encontre nenhum Produto devolva uma lista vazia
     *
     * Parâmetro categoria: Categoria desejada Return Produtos encontrados
     */
    public List<Produto> findProdutoPorCategoria(String categoria) {
        List<Produto> listaCategoria = new ArrayList<>();

        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getCategoria().equalsIgnoreCase(categoria)) {
                listaCategoria.add(produtos.get(i));
            }
        }

        if (listaCategoria.isEmpty()) {
            System.out.println("Categoria não encontrada.");
        }

        return listaCategoria;
    }

    /**
     * Encontra todos os ProdutoInternacional presentes no Carrinho. Caso não
     * encontre nenhum ProdutoInternacional devolva uma lista vazia
     *
     * Retorna Produtos internacionais encontrados
     */
    public Integer countProdutosInternacionais() {
        Integer ProdutosInter = 0;  
        
        for (Produto produto : produtos) {
            if (produto instanceof ProdutoInternacional) {
                ProdutosInter++;
            }
        }
        return ProdutosInter;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}
