package sptech.lista.introducao.poo;

/**
 *
 * @author alan
 */
public class AppEmpregado {

    public static void main(String[] args) {
        Empregado empregado1 = new Empregado();
        Empregado empregado2 = new Empregado();
        Empregado empregado3 = new Empregado();

        empregado1.nome = "João";
        empregado1.cargo = "Analista de sistemas";
        empregado1.salario = 5400.0;

        empregado1.reajustarSalario(0.15);

    }
}
