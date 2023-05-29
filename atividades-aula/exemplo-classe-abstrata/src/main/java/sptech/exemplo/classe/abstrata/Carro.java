/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.exemplo.classe.abstrata;

/**
 *
 * @author alan
 */
public class Carro extends Veiculo {

    private Boolean possuiEstepe;
    private Double nivelOleo;

    public Carro(Boolean possuiEstepe, Double nivelOleo, String proprietario, Integer anoFabricacao, String marca) {
        super(proprietario, anoFabricacao, marca);
        this.possuiEstepe = possuiEstepe;
        this.nivelOleo = nivelOleo;
    }

    @Override
    public void relatorioDeRevisao() {
        System.out.println("Exibindo relatório do carro: " + proprietario);
        if (!possuiEstepe) {
            System.out.println("Necessário comprar estepe.");
        } else {
            System.out.println("Estepe ok!");
        }

        if (nivelOleo < 1.5) {
            System.out.println("Necessário comprar óleo.");
        } else {
            System.out.println("Nível do óleo ok.");
        }
    }

    public Boolean getPossuiEstepe() {
        return possuiEstepe;
    }

    public void setPossuiEstepe(Boolean possuiEstepe) {
        this.possuiEstepe = possuiEstepe;
    }

    public Double getNivelOleo() {
        return nivelOleo;
    }

    public void setNivelOleo(Double nivelOleo) {
        this.nivelOleo = nivelOleo;
    }

}
