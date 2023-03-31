package sptech.ac2.segunda.atividade.petshop;

/**
 *
 * @author alan
 */
public class PetShop {

    private String nome;
    private Double faturamentoTotal;

    public PetShop(String nome) {
        this.nome = nome;
        this.faturamentoTotal = 0.0;
    }

    public void darBanho(Pet pet, Double valor) {

        Double gastoAnterior = pet.getValorGastoEmPetShop();
        Double gastoAtual = valor * pet.getQtdVisitasAoPetShop();

        pet.setValorGastoEmPetShop(gastoAtual);
        faturamentoTotal += gastoAtual;

    }

    public void darBanho(Pet pet, Double valor, Integer desconto) {

        Double valorComDesconto = valor * (1 - desconto / 100.0);
        Double gastoAnterior = pet.getValorGastoEmPetShop();
        Double gastoAtual = valorComDesconto * pet.getQtdVisitasAoPetShop();
        pet.setValorGastoEmPetShop(gastoAtual);
        faturamentoTotal += gastoAtual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getFaturamentoTotal() {
        return faturamentoTotal;
    }

    public void setFaturamentoTotal(Double faturamentoTotal) {
        this.faturamentoTotal = faturamentoTotal;
    }

    @Override
    public String toString() {
        String frase = String.format("Nome: %s \n"
                + "Faturamento total: R$%.2f \n",
                nome, faturamentoTotal);

        return frase;
    }

}
