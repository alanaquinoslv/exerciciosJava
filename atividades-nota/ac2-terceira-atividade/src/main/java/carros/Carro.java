package carros;

/**
 *
 * @author alan
 */
public class Carro {

    private String modelo;
    private Double valor;
    private Integer ano;
    private String marca;

    public Carro(String modelo, Double valor, Integer ano, String marca) {
        this.modelo = modelo;
        this.valor = valor;
        this.ano = ano;
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getAno() {
        return ano;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        String frase = String.format("\n"
                + "Modelo: %s \n"
                + "Valor: R$%.2f \n"
                + "Ano: %d \n"
                + "Marca: %s"
                + "\n", modelo, valor, ano, marca);
        return frase;
    }

}
