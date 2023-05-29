package faculdade;

/**
 *
 * @author alan
 */
public class TesteFaculdade {

    public static void main(String[] args) {
        Aluno aluno01 = new Aluno("D96CGB-7", "Alan", 1);
        Aluno aluno02 = new Aluno("FJ21CS-R", "Anderson", 1);
        Aluno aluno03 = new Aluno("AV3DSQ-5", "Danilo", 2);
        
        Faculdade faculdade = new Faculdade("Unip");
        
        faculdade.matricularAluno(aluno03);
        faculdade.matricularAluno(aluno02);
        faculdade.matricularAluno(aluno01);
        faculdade.cancelarMatricula("D96CGB-7");
        //faculdade.exibirAlunosPorSemestre(1);
        faculdade.exibirCancelados();
        //faculdade.exibirAlunos();
    }
}
