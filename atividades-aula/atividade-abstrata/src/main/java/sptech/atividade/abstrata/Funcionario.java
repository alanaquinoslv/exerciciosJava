package sptech.atividade.abstrata;

/**
 *
 * @author alan
 */
public abstract class Funcionario {

    protected String cpf;
    protected String nome;

    public Funcionario(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public abstract Double calcSalario();

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "cpf=" + cpf + ", nome=" + nome + '}';
    }

    
    
}
