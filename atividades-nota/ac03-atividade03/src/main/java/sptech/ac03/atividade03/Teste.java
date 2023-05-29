/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.ac03.atividade03;

/**
 *
 * @author alan
 */
public class Teste {

    public static void main(String[] args) {
        EscolaVirtual escola = new EscolaVirtual("Minha Escola Virtual", 3);

        Professor professor1 = new Professor("João Silva", "Introdução a Java", 150.0, 20);
        Palestrante palestrante1 = new Palestrante("Maria Silva", "Desenvolvimento Web", 200.0, 30, 5, 50.0);
        Palestrante palestrante2 = new Palestrante("Carlos Santos", "Inteligência Artificial", 250.0, 15, 3, 70.0);

        escola.contratarProfessor(professor1);
        escola.contratarProfessor(palestrante1);
        escola.contratarProfessor(palestrante2);

        escola.exibirTodos();

        System.out.println();

        escola.exibePalestrantes();

        System.out.println();

        escola.exibeFolhaDePagamento();

        System.out.println();

        escola.atualizarValorCurso("Desenvolvimento Web", 220.0);

        System.out.println();

        Professor professorEncontrado = escola.buscarProfessor("Maria Silva");
        if (professorEncontrado != null) {
            System.out.println("Professor encontrado: " + professorEncontrado.toString());
        } else {
            System.out.println("Professor não encontrado.");
        }

        System.out.println();

        System.out.println(escola.toString());

    }
}
