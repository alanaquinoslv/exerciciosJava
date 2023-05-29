package com.bandtec.projeto.lista.desafio3;

/**
 *
 * @author alan
 */
public class TesteAutomatizado {

    public static void main(String[] args) {
        Aluno aluno01 = new Aluno("ABC123", "Alan", 3);
        Aluno aluno02 = new Aluno("FGH467", "Diego", 1);
        Aluno aluno03 = new Aluno("ADF213", "Maria", 1);

        Faculdade faculdade = new Faculdade("Uninove");

        faculdade.matricularAluno(aluno01);
        faculdade.matricularAluno(aluno02);
        faculdade.matricularAluno(aluno03);
        faculdade.matricularAluno(null);

        faculdade.existsAlunoPorNome("alan");
        faculdade.cancelarMatricula("ADF213");
        faculdade.getQuantidadeAlunos();
        faculdade.getQuantidadeAlunosPorSemestre(1);
        faculdade.getQuantidadeAlunosComMatriculaCancelada();

        

    }
}
