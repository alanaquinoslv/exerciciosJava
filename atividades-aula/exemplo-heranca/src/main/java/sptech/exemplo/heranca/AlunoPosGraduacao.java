package sptech.exemplo.heranca;

/**
 *
 * @author alan
 */
public class AlunoPosGraduacao extends Aluno {

    private Double notaArtigo;
    private Double notaTcc;

    public AlunoPosGraduacao(Double notaArtigo, Double notaTcc,
            String ra, String nome, Double nota01, Double nota02) {
        //construtor não é herdado, pois não tem mesmo nome da classe
        //mas podemos chamar o construtor da superclasse
        super(ra, nome, nota01, nota02);  // chama algo da super classe
        this.nome = nome;
        this.notaArtigo = notaArtigo;
        this.notaTcc = notaTcc;
    }

    @Override
    public Double calcularMedia() {
        return (super.nota01 + super.nota02
                + this.notaArtigo + this.notaTcc / 4.0);
    }

    public Double getNotaArtigo() {
        return notaArtigo;
    }

    public void setNotaArtigo(Double notaArtigo) {
        this.notaArtigo = notaArtigo;
    }

    public Double getNotaTcc() {
        return notaTcc;
    }

    public void setNotaTcc(Double notaTcc) {
        this.notaTcc = notaTcc;
    }

    @Override
    public String toString() {
        return String.format("%s \n"
                + "Nota artigo: %.1f \n"
                + "Nota TCC: %.1f \n"
                + "Média: %.1f",
                super.toString(),
                notaArtigo, notaTcc, this.calcularMedia());
        //se chamar super.calcmedia, mostra o calculo da superclasse

    }
}
