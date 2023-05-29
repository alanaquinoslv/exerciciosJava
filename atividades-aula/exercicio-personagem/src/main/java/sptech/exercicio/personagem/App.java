/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.exercicio.personagem;

/**
 *
 * @author alan
 */
public class App {

    public static void main(String[] args) {
        Heroi heroi01 = new Heroi("SuperMan", "Clark Kent");
        Heroi heroi02 = new Heroi("Batman", "Bruce Wayne");
        Vilao vila01 = new Vilao("Lex luthor", "Kevin Hart");
        Vilao vila02 = new Vilao("Coringa", "Arthur Fleck");

        lutar(heroi01, vilao01);
        lutar(heroi02, vilao02);
    }
}
