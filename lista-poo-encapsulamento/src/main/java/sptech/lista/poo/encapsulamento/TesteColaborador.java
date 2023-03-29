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

        System.out.println(String.format("Informações dos colaboradores: \n"
                + "Nome: %s \n"
                + "Cargo: %s \n"
                + "Salario: R$%.2f \n"
                + "------------------ \n"
                + "Nome: %s \n"
                + "Cargo: %s \n"
                + "Salario: R$%.2f \n",
                colaborador01.getNome(), colaborador01.getCargo(), colaborador01.getSalario(),
                colaborador02.getNome(), colaborador02.getCargo(), colaborador02.getSalario()));

        rh.promoverColaborador(colaborador01, "Analista Pleno", 5200.0);
        rh.promoverColaborador(colaborador01, "Analista Sênior", 5100.0);

        rh.reajustarSalario(colaborador01, 0.15);

        System.out.println("Informações dos colaboradores atualizadas: \n"
                + colaborador01.getNome() + " - " + colaborador01.getCargo() + " - R$" + colaborador01.getSalario() + "\n"
                + colaborador02.getNome() + " - " + colaborador02.getCargo() + " - R$" + colaborador02.getSalario());

        System.out.println(String.format("Informações dos colaboradores atualizadas: \n"
                + "Nome: %s \n"
                + "Cargo: %s \n"
                + "Salario: R$%.2f \n"
                + "------------------ \n"
                + "Nome: %s \n"
                + "Cargo: %s \n"
                + "Salario: R$%.2f \n",
                colaborador01.getNome(), colaborador01.getCargo(), colaborador01.getSalario(),
                colaborador02.getNome(), colaborador02.getCargo(), colaborador02.getSalario()));

        System.out.println("Total de promovidos: " + rh.getTotalPromovidos());
        System.out.println("Total de reajustes: " + rh.getTotalSalariosReajustados());

    }
}
