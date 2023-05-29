package sptech.exemplo.relacionamento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alan
 */
public class Grupo {

    private String nome;
    private List<Contato> contatos;

    public Grupo(String nome) {
        this.nome = nome;
        this.contatos = new ArrayList<>();
    }

    public void adicionar(Contato c) {
        contatos.add(c);
    }

    @Override
    public String toString() {
        return String.format("\n---------\n"
                + "Grupo: %s \n"
                + "Contatos: %s ",
                nome, contatos);
    }

}
