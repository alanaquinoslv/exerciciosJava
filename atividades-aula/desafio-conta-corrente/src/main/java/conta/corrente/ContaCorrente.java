package conta.corrente;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alan
 */
public class ContaCorrente {

    private String titular;
    private Double saldo = 0.0;
    private List<Historico> historicos;

    public ContaCorrente(String titular) {
        this.titular = titular;
        this.historicos = new ArrayList<>();
    }

    public void depositar(Double valor, Integer dia, Integer mes, Integer ano) {
        if (valor > 0 && mes > 0 && mes <= 12 && dia > 0 && dia <= 31) {
            saldo += valor;
            historicos.add(new Historico(dia, mes, ano, valor, "Depósito"));
        } else {
            System.out.println("Insira os dados corretamente.");
        }
    }

    public void sacar(Double valor, Integer dia, Integer mes, Integer ano) {
        if (saldo > 0 && mes > 0 && mes <= 12 && dia > 0 && dia <= 31) {
            saldo -= valor;
            historicos.add(new Historico(dia, mes, ano, valor, "Saque"));
        } else {
            System.out.println("Insira os dados corretamente.");
        }
    }

    public void exibirExtrato(ContaCorrente cc) {
        System.out.println(String.format("Titular: %s - Saldo: R$%.2f \n"
                + "Extratos:", titular, saldo));
        System.out.println(historicos);
    }

    public String getTitular() {
        return titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return String.format("Titular: %s \n"
                + "Saldo: %.2f", titular, saldo);
    }

}
