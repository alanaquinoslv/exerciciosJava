/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.exemplo.classe.abstrata;

/**
 *
 * @author alan
 */
public class TesteMecanica {

    public static void main(String[] args) {
        Bicicleta veiculo01 = new Bicicleta(10, 67.0,
                "Alan", 2018, "Caloi");
        Carro veiculo02 = new Carro(true, 14.2,
                "José", 2007, "Chevrolet");

        Mecanica mecanica01 = new Mecanica("Líder");

        mecanica01.registrarVeiculoCliente(veiculo02);
        mecanica01.registrarVeiculoCliente(veiculo01);

        mecanica01.exibirRelatorioRevisaoClientes();
    }
}
