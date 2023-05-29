package sptech.pratica.heranca.pt2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alan
 */
public class Titular {

    private String nome;
    private Integer anoDeNascimento;
    private String cpf;
    private List<Boleto> boletos;

    ContaBancaria contaBancaria;

    public Titular(String nome, Integer anoDeNascimento, String cpf, ContaBancaria contaBancaria) {
        this.nome = nome;
        this.anoDeNascimento = anoDeNascimento;
        this.cpf = cpf;
        this.boletos = new ArrayList<>();
        this.contaBancaria = contaBancaria;
    }

    public void realizarPagamentoTotal(Double valorPagamento) {

        if (contaBancaria.getSaldo() > valorPagamento) {
            contaBancaria.setSaldo((contaBancaria.getSaldo() - valorPagamento));
        }
    }
    
    
}
