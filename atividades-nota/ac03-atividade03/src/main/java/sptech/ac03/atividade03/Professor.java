package sptech.ac03.atividade03;

/**
 *
 * @author alan
 */
public class Professor {

    private String nome;
    private String curso;
    private Double valorCurso;
    private Integer qtdAlunos;

    public Professor(String nome, String curso, Double valorCurso, Integer qtdAlunos) {
        this.nome = nome;
        this.curso = curso;
        this.valorCurso = valorCurso;
        this.qtdAlunos = qtdAlunos;
    }

    public double calcularGanho() {
        return valorCurso * 0.05 * qtdAlunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Double getValorCurso() {
        return valorCurso;
    }

    public void setValorCurso(Double valorCurso) {
        this.valorCurso = valorCurso;
    }

    public Integer getQtdAlunos() {
        return qtdAlunos;
    }

    public void setQtdAlunos(int qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }

    @Override
    public String toString() {
        return "Professor: " + nome
                + "\nCurso: " + curso
                + "\nValor do Curso: R$ " + valorCurso
                + "\nQuantidade de Alunos: " + qtdAlunos
                + "\nGanho Mensal: R$ " + calcularGanho();
    }

}
