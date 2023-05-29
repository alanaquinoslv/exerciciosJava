package sptech.lista.poo.encapsulamento;

/**
 *
 * @author alan
 */
public class Colaborador {

    private String nome;
    private String cargo;
    private Double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void exibirColaborador() {
        System.out.println(String.format("Informações dos colaboradores: \n"
                + "Nome: %s \n"
                + "Cargo: %s \n"
                + "Salário: %.2f \n",
                nome, cargo, salario));
    }

}
