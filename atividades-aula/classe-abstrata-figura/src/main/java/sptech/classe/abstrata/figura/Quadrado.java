package sptech.classe.abstrata.figura;

/**
 *
 * @author alan
 */
public class Quadrado extends Figura {

    private Double lado;

    public Quadrado(Double lado, String cor, Integer espessura) {
        super(cor, espessura);
        this.lado = lado;
    }

    @Override
    public Double calculaArea() {
        return (lado * lado);
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return String.format("Lado: %s \n"
                + "%s \n",
                lado, super.toString());
    }

}
