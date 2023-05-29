package conta.corrente;

/**
 *
 * @author alan
 */
public class TesteContaCorrente {

    public static void main(String[] args) {
        ContaCorrente cc01 = new ContaCorrente("Alan");

        cc01.depositar(100.0, 24, 8, 2022);
        cc01.sacar(50.0, 28, 8, 2022);
        cc01.depositar(-50.0, 0, 15, 2022);
        cc01.sacar(-10.0, 45, 13, 2023);
        cc01.exibirExtrato(cc01);

        //System.out.println(Historico);
    }
}
