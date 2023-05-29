package sptech.ac2.segunda.atividade;

/**
 *
 * @author alan
 */
public class TesteAtividade {

    public static void main(String[] args) {
        Atividade atv01 = new Atividade("Diagrama", "Alan", 3);
        Atividade atv02 = new Atividade("Dashboard", "Victor", 5);
        Atividade atv03 = new Atividade("Documentação", "Sara", 1);

        atv01.terminarAtividades(9);
        atv01.calcularTempo();
        System.out.println(atv01);
        atv02.terminarAtividades(4);
        atv02.calcularTempo();
        System.out.println(atv02);
        atv03.terminarAtividades(1);
        atv03.calcularTempo();
        System.out.println(atv03);

    }

}
