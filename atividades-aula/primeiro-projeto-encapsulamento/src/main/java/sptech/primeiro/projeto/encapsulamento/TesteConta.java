package sptech.primeiro.projeto.encapsulamento;

/**
 *
 * @author alan
 */
public class TesteConta {

    public static void main(String[] args) {
        ContaCorrente conta01 = new ContaCorrente();
        ContaCorrente conta02 = new ContaCorrente();
        
        conta01.setNomeTitular("Xampson");
        conta02.setNomeTitular("Douglas");


        conta01.sacar(100.0);
        conta01.depositar(500.0);
        conta01.sacar(50.0);
        
        String nomeConta01 = conta01.getNomeTitular();

    }
}
