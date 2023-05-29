package sptech.lista.poo.encapsulamento;

/**
 *
 * @author alan
 */
public class Colaborador {

    // aplicando construtores
    private String nome;
    private String cargo;
    private Double salario;

    //sempre abaixo dos atributos, sempre public e sempre mesmo nome da classe
    public Colaborador(String nome, String cargo, Double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

//    Sobrecarga de construtor
    public Colaborador(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = 1345.0;
    }

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

    // sobreescrita
    @Override
    public String toString() {
        String fraseFormatada = String.format("Informações dos colaboradores: \n"
                + "Nome: %s \n"
                + "Cargo: %s \n"
                + "Salário: %.2f \n",
                nome, cargo, salario);

        return fraseFormatada;
    }

}
