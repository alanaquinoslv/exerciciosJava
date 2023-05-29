/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.segundo.projeto.nivelamento;

/**
 *
 * @author alan
 */
public class Ternario {

    public static void main(String[] args) {
        Boolean bloqueado = true;

        String frase;

        // metodo normal
        if (bloqueado) {
            frase = "Usuário bloqueado.";
        } else {
            frase = "Usuário desbloqueado.";
        }
        frase = bloqueado ? "Usuário bloqueado." : "Usuário desbloqueado.";

        // não serve somente para booleano
        //ex: se o salario for maior que mil reais, o bonus sera de 0,5
        // se for menor que mil o bonus sera de 0,2
        Double salario = 1075.0;
        Double bonus = 0.0;

        if (salario > 1000.0) {
            bonus = 0.5;
        } else {
            bonus = 0.2;
        }

        bonus = salario > 1000.0 ? 0.5 : 0.2;

    }
}
