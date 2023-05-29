package sptech.lista.introducao.poo;

/**
 *
 * @author alan
 */
public class Empregado {

    String nome;
    String cargo;
    Double salario;

    public void reajustarSalario(Double porcentagemReajuste) {
        salario += salario * porcentagemReajuste;

        System.out.println(String.format("Salário reajustado: R$ %.2f", salario));
    }

    void exibirSalario() {
        System.out.println(String.format("Salário reajustado: R$ %.2f", salario));
    }

}
