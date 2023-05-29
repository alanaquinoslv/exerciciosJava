package sptech.pratica.heranca.pt2;

/**
 *
 * @author alan
 */
public class ContaBancaria {

    private String dono;
    private Double saldo;

    public ContaBancaria(String dono, Double saldo) {
        this.dono = dono;
        this.saldo = saldo;
    }

    public void saque(Double valor) {
        if (valor > 0) {
            saldo -= valor;
        }
    }
    
    public void deposito(Double valor) {
        if (valor>0) {
            saldo+=valor;
        }
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return String.format("Dono: %s \n"
                + "Saldo R$%.2f",
                dono, saldo);
    }

}
