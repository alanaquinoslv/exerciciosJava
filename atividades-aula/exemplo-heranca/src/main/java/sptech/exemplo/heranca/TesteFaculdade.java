package sptech.exemplo.heranca;

/**
 *
 * @author alan
 */
public class TesteFaculdade {

    public static void main(String[] args) {
        //criando somente 1 aluno

        Aluno alunoComum = new Aluno("32DFG1",
                "Maria",
                6.7, 7.9);

        AlunoPosGraduacao alunoPos = new AlunoPosGraduacao(8.2,
                7.7, "342DC1",
                "João", 7.5, 9.0);

//        System.out.println("Média aluno comum: " + alunoComum.calcularMedia());
//        System.out.println("Nota aluno pós: " + alunoPos.calcularMedia());

        System.out.println(alunoComum);
        System.out.println("----------------");
        System.out.println(alunoPos);
    }

}
