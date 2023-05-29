package produtora;

import consultoria.Desenvolvedor;
import consultoria.DesenvolvedorMobile;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alan
 */
public class Produtora {

    private String nome;
    private Integer vagas;
    private List<Ator> atores;

    public Produtora(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.atores = new ArrayList<>();
    }

    public Boolean existePorNome(String nome) {
        for (int i = 0; i < atores.size(); i++) {
            if (atores.get(i).getNome().equalsIgnoreCase(nome)) {
                return true;
            }
        }
        return false;
    }

    public void contratar(Ator ator) {
        if (ator == null) {
            return;
        }
        if (!existePorNome(ator.getNome())) {
            if (vagas > 0) {
                atores.add(ator);
                vagas--;
            } else {
                System.out.println("Não há vagas disponíveis.");
            }
        }
    }

    public Integer getQuantidadeAtores() {
        Integer qtdAtores = 0;
        for (Ator ator : atores) {
            qtdAtores++;
        }
        return qtdAtores;
    }

    public Integer getQuantidadeProtagonistas() {
        Integer qtdProtagonistas = 0;

        for (Ator ator : atores) {
            if (ator instanceof Protagonista) {
                qtdProtagonistas++;
            }
        }
        return qtdProtagonistas;
    }

    public Double getTotalSalarios() {
        Double totalSalarios = 0.0;

        for (int i = 0; i < atores.size(); i++) {
            totalSalarios += atores.get(i).getSalario();
        }
        return totalSalarios;
    }

    List<Ator> buscarAtorPorNome(String nome) {
        List<Ator> listaNomeAtor = new ArrayList<>();

        for (int i = 0; i < atores.size(); i++) {
            if (atores.get(i).getNome().equalsIgnoreCase(nome)) {
                listaNomeAtor.add(atores.get(i));
            }
        }

        if (listaNomeAtor.isEmpty()) {
            System.out.println("Ator não encontrado.");
        }
        return listaNomeAtor;
    }

}
