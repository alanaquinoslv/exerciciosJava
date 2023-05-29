package com.mycompany.correcao.colaborador.rh;

/**
 *
 * @author Admin
 */
public class RecursosHumanos {

    private Integer quantidadePromocoes;
    private Integer quantidadeReajustes;

    public RecursosHumanos() {
        this.quantidadePromocoes = 0;
        this.quantidadeReajustes = 0;
    }
    
    public void reajustarSalario(Colaborador colab,
            Double valorRejuste) {
        if (valorRejuste > 0.0) {
            Double salarioAtual = colab.getSalario();
            colab.setSalario(salarioAtual + valorRejuste);
            quantidadeReajustes++;
            System.out.println("Reajuste realizado");
        } else {
            System.out.println("Valor inválido");
        }
    }

    public void promoverColaborador(Colaborador colab,
            String novoCargo, Double novoSalario) {
        
        Double salarioAtual = colab.getSalario();
        
        if (salarioAtual < novoSalario) {
            colab.setCargo(novoCargo);
            colab.setSalario(novoSalario);
            System.out.println("Colaborador Promovido!");
            quantidadePromocoes++;
        } else {
            System.out.println("Operação Inválida");
        }
    }

    public Integer getQuantidadePromocoes() {
        return quantidadePromocoes;
    }

    public Integer getQuantidadeReajustes() {
        return quantidadeReajustes;
    }

    @Override
    public String toString() {
        return String.format("RH: "
                + "\nReajustes: %d"
                + "\nPromoções: %d", 
                quantidadeReajustes, 
                quantidadePromocoes);
    }
    
    

}
