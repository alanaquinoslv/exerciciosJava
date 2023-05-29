/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.atividade.abstrata;

/**
 *
 * @author alan
 */
public class Vendedor extends Funcionario {

    private Double vendas;
    private Double taxa;

    public Vendedor(Double vendas, Double taxa, String cpf, String nome) {
        super(cpf, nome);
        this.vendas = vendas;
        this.taxa = taxa;
    }

    @Override
    public Double calcSalario() {
        return (vendas * taxa);
    }

    public Double getVendas() {
        return vendas;
    }

    public void setVendas(Double vendas) {
        this.vendas = vendas;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }


   

}
