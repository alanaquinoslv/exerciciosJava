package sptech.atividade.abstrata;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alan
 */
public class Empresa {

    private String nome;
    private List<Funcionario> funcionarios;

    public Empresa(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFunc(Funcionario func) {
        funcionarios.add(func);
    }

    public void exibeTodos() {
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }

    public void exibeTotalSalario() {
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.calcSalario());
        }
        
        
    }

}
