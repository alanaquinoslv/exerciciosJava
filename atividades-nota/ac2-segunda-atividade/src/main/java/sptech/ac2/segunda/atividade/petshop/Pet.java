package sptech.ac2.segunda.atividade.petshop;

/**
 *
 * @author alan
 */
public class Pet {

    private String nome;
    private String raca;
    private Integer qtdVisitasAoPetShop;
    private Double valorGastoEmPetShop;

    public Pet(String nome, String raca, Integer qtdVisitasAoPetShop, Double valorGastoEmPetShop) {
        this.nome = nome;
        this.raca = raca;
        this.qtdVisitasAoPetShop = qtdVisitasAoPetShop;
        this.valorGastoEmPetShop = valorGastoEmPetShop;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Double getValorGastoEmPetShop() {
        return valorGastoEmPetShop;
    }

    public void setValorGastoEmPetShop(Double valorGastoEmPetShop) {
        this.valorGastoEmPetShop = valorGastoEmPetShop;
    }

    public Integer getQtdVisitasAoPetShop() {
        return qtdVisitasAoPetShop;
    }

    public void setQtdVisitasAoPetShop(Integer qtdVisitasAoPetShop) {
        this.qtdVisitasAoPetShop = qtdVisitasAoPetShop;
    }

    @Override
    public String toString() {
        String frase = String.format("Nome: %s \n"
                + "Raça: %s \n"
                + "Quantidade de visitas: %d \n"
                + "Valor gasto em PetShop: R$%.2f \n",
                nome, raca, qtdVisitasAoPetShop, valorGastoEmPetShop);
        return frase;
    }

}
