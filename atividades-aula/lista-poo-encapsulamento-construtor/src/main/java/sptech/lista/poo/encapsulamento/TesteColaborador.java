package sptech.lista.poo.encapsulamento;

/**
 *
 * @author alan
 */
public class TesteColaborador {

    // aplicando construtores
    public static void main(String[] args) {
        Colaborador colaborador01 = new Colaborador("Rafael",
                "Analista Jr", 3800.0);
        Colaborador colaborador02 = new Colaborador("Fábio",
                "Analista Pleno", 5200.0);

        RecursosHumanos rh = new RecursosHumanos();

//        colaborador01.exibirColaborador();
//        colaborador02.exibirColaborador();
        rh.promoverColaborador(colaborador01, "Analista Pleno", 5200.0);
        rh.promoverColaborador(colaborador01, "Analista Sênior", 5100.0);

        rh.reajustarSalario(colaborador01, 0.15);

        // ao invés de chamar o método exibir, podemos fazer print do objeto
        // porém é necessário sobreescrever o toString na classe
        
//        colaborador01.exibirColaborador();
//        colaborador02.exibirColaborador();
        System.out.println(colaborador01.toString());

        System.out.println(rh.toString());

    }
}
