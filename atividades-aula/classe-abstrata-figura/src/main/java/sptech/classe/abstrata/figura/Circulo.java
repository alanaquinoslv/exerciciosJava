package sptech.classe.abstrata.figura;

/**
 *
 * @author alan
 */
public class Circulo extends Figura {

    private Double raio;

    public Circulo(Double raio, String cor, Integer espessura) {
        super(cor, espessura);
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public Double calculaArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public String toString() {
        return String.format("Raio: %s \n"
                + "%s \n",
                raio, super.toString());
    }

}
