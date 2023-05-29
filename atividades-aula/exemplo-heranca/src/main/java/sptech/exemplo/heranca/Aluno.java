package sptech.exemplo.heranca;

/**
 *
 * @author alan
 */
public class Aluno {

    protected String ra;
    protected String nome;
    protected Double nota01;
    protected Double nota02;

    public Aluno(String ra, String nome, Double nota01, Double nota02) {
        this.ra = ra;
        this.nome = nome;
        this.nota01 = nota01;
        this.nota02 = nota02;
    }

    public Double calcularMedia() {
        return (nota01 + nota02) / 2.0;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNota01() {
        return nota01;
    }

    public void setNota01(Double nota01) {
        this.nota01 = nota01;
    }

    public Double getNota02() {
        return nota02;
    }

    public void setNota02(Double nota02) {
        this.nota02 = nota02;
    }

    @Override
    public String toString() {
        return String.format("RA: %s \n"
                + "Nome: %s \n"
                + "Nota 01: %.1f \n"
                + "Nota 02: %.1f",
                ra, nome, nota01, nota02);
    }

}
