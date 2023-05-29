package sptech.primeiro.projeto.encapsulamento;

/**
 *
 * @author alan
 */
// protegendo atributos com private
// faz com que atributo seja acessado somente na classe em que foi criado
public class ContaCorrente {

    // atributos == caracteeristicas
    private String nomeTitular;
    private String cpf;
    private Double saldo = 0.0;

    // metodos == comportamentos
    // sacar e retornar o saldo atual
    Double sacar(Double valorSaque) {

        if (saldo == 0) {
            System.out.println("Saldo zerado");
        } else if (saldo >= valorSaque && valorSaque > 0) {
            saldo -= valorSaque;
            System.out.println(String.format("Saque: %.2f \nSaldo: %.2f",
                    valorSaque, saldo));
        } else {
            System.out.println("Saldo insuficiente ou negativo.");
        }

        return saldo;

    }

    void depositar(Double valorDepositar) {
        if (valorDepositar > 0) {
            saldo += valorDepositar;
        }
        System.out.println("Saldo atual: R$" + saldo);
    }

//    ja que nao conseguimos acessar os atributos
//    cria-se metodos que fazem esses acessos
//    porque dentro da propria classe do metodo o acesso é livre
//    this. referencia o atributo da classe e nao o argumento
    public void setNomeTitular(String NomeTitular) {
        this.nomeTitular = NomeTitular;
    }

    public String getNomeTitular() {
        return nomeTitular; 
    }

    // ALT + INSERT ----> Getters and Setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    


}
