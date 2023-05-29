package consultoria;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alan
 */
public class Consultoria {

    private String nome;
    private Integer vagas;
    private List<Desenvolvedor> desenvolvedores;

    public Consultoria(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.desenvolvedores = new ArrayList<>();
    }

    public Boolean existePorNome(String nome) {
        for (int i = 0; i < desenvolvedores.size(); i++) {
            if (desenvolvedores.get(i).getNome().equalsIgnoreCase(nome)) {
                return true;
            }
        }
        return false;
    }

    public void contratar(Desenvolvedor dev) {
        if (dev == null) {
            return;
        }
        if (!existePorNome(dev.getNome())) {
            if (vagas > 0) {
                desenvolvedores.add(dev);
                vagas--;
            } else {
                System.out.println("Não há vagas disponíveis.");
            }
        }
    }

    public Integer getQuantidadeDesenvolvedores() {
        Integer qtdDevs = 0;
        for (Desenvolvedor desenvolvedor : desenvolvedores) {
            qtdDevs ++;
        }
        return qtdDevs;
    }

    public Integer getQuantidadeDesenvolvedoresMobile() {
        Integer qtdDevsMobile = 0;

        for (Desenvolvedor desenvolvedor : desenvolvedores) {
            if (desenvolvedor instanceof DesenvolvedorMobile) {
                qtdDevsMobile++;
            }
        }
        return qtdDevsMobile;
    }

    public Double getTotalSalarios() {
        Double totalSalarios = 0.0;

        for (int i = 0; i < desenvolvedores.size(); i++) {
            totalSalarios += desenvolvedores.get(i).getSalario();
        }
        return totalSalarios;
    }

    List<Desenvolvedor> buscarDesenvolverPorNome(String nome) {
        List<Desenvolvedor> listaNomeDev = new ArrayList<>();

        for (int i = 0; i < desenvolvedores.size(); i++) {
            if (desenvolvedores.get(i).getNome().equalsIgnoreCase(nome)) {
                listaNomeDev.add(desenvolvedores.get(i));
            }
        }

        if (listaNomeDev.isEmpty()) {
            System.out.println("Desenvolvedor não encontrado.");
        }
        return listaNomeDev;
    }

}
