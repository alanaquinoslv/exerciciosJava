package sptech.primeiro.projeto.poo;

/**
 *
 * @author alan
 */
// uma classe representa um objeto
public class BilheteUnico {
    // atributos representam caracteristicas 

    String nomeTitular;
    Double saldo;
    Boolean possuiMeiaTarifa;

    // métodos representam comportamentos
    void recarregar(Double valorRecarga) {
        // so passa argumento se nao for caracteristica
        //comportamentos alteram caracteristicas
        // métodos alteram os atributos

        if (valorRecarga > 0) {
            saldo += valorRecarga;
            System.out.println("Novo saldo: R$" + saldo);
        } else {
            System.out.println("Valor inválido.");
        }
    }

    void usar() {

        if (possuiMeiaTarifa && saldo >= 2.20) {
            saldo -= 2.20;
            System.out.println("Liberado - Saldo: R$" + saldo);
        } else if (saldo >= 4.40) {
            saldo -= 4.40;
            System.out.println("Liberado - Saldo: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}
