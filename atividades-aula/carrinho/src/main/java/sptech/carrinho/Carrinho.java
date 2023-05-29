package sptech.carrinho;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alan
 */
public class Carrinho {

    private String cliente;
    private List<Produto> produtos;

    public Carrinho(String cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
    }

    Integer getQuantidade() {
        Integer quantidadeProdutos = produtos.size();
        return quantidadeProdutos;
    }

    public void adicionar(Produto p) {
        produtos.add(p);
    }

    Boolean existsPorNome(String nome) {
        Boolean existe = false;
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                existe = true;
            }
        }

        return existe;
    }

    Integer getQuantidadePorCategoria(String nome) {
        Integer quantidade = 0;

        for (Produto produto : produtos) {
            if (produto.getCategoria().equalsIgnoreCase(nome)) {
                quantidade++;
            }
        }

        return quantidade;
    }

    public void limpar() {
        produtos.clear();
    }

    public void removerPorNome(String nome) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getNome().equalsIgnoreCase(nome)) {
                produtos.remove(i);
            }
        }
    }

    List<Produto> getPorNome(String nome) {
        List<Produto> listaNome = new ArrayList<>();

        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getNome().equalsIgnoreCase(nome)) {
                listaNome.add(produtos.get(i));
            }
        }

        return listaNome;
    }

    Double getValorTotal() {
        Double somaValores = 0.0;

        for (int i = 0; i < produtos.size(); i++) {
            somaValores += produtos.get(i).getPreco();
        }

        return somaValores;
    }

    @Override
    public String toString() {
        return String.format("\n -------- \n"
                + "Cliente %s \n"
                + "Produtos: %s",
                cliente, produtos);
    }

}
