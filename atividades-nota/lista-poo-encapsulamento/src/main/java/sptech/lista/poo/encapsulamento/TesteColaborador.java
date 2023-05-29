package sptech.lista.poo.encapsulamento;

/**
 *
 * @author alan
 */
public class TesteColaborador {

    public static void main(String[] args) {
        Colaborador colaborador01 = new Colaborador();
        Colaborador colaborador02 = new Colaborador();

        colaborador01.setNome("Rafael");
        colaborador01.setCargo("Analista Jr");
        colaborador01.setSalario(3500.0);

        colaborador02.setNome("Fabio");
        colaborador02.setCargo("Analista Pleno");
        colaborador02.setSalario(5200.0);

        RecursosHumanos rh = new RecursosHumanos();

        colaborador01.exibirColaborador();
        colaborador02.exibirColaborador();

        rh.promoverColaborador(colaborador01, "Analista Pleno", 5200.0);
        rh.promoverColaborador(colaborador01, "Analista Sênior", 5100.0);

        rh.reajustarSalario(colaborador01, 0.15);

        colaborador01.exibirColaborador();
        colaborador02.exibirColaborador();

        rh.exibirRh();

    }
}
