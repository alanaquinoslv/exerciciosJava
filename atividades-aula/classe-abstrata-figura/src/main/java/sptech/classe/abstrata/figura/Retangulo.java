package sptech.classe.abstrata.figura;

/**
 *
 * @author alan
 */
public class Retangulo extends Figura {

    private Double base;
    private Double altura;

    public Retangulo(Double base, Double altura, String cor, Integer espessura) {
        super(cor, espessura);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Double calculaArea() {
        return base * altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return String.format("Base: %s \n"
                + "Altura: %s \n"
                + "%s",
                base, altura, super.toString());
    }

}
