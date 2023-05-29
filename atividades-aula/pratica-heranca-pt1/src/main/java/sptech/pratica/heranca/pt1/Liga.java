package sptech.pratica.heranca.pt1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alan
 */
public class Liga {

    private String nome;
    private String pais;
    private List<Time> times;

    public Liga(String nome, String pais) {
        this.nome = nome;
        this.pais = pais;
        this.times = new ArrayList<>();
    }

    public Boolean existePorNome(String nome) {
        for (int i = 0; i < times.size(); i++) {
            if (times.get(i).getNome().equalsIgnoreCase(nome)) {
                return true;
            }
        }
        return false;
    }

    public Integer getQtdTimes() {
        Integer qtdTimes = 0;
        for (Time time : times) {
            qtdTimes++;
        }
        return qtdTimes;
    }

    List<Time> buscarTimePorNome(String nome) {
        List<Time> listaTime = new ArrayList<>();

        for (int i = 0; i < times.size(); i++) {
            if (times.get(i).getNome().equalsIgnoreCase(nome)) {
                listaTime.add(times.get(i));
            }
        }

        if (listaTime.isEmpty()) {
            System.out.println("Time não encontrado.");
        }
        return listaTime;
    }

    public void cadastrarTime(Time time) {
        if (time == null) {
            return;
        }

        if (!existePorNome(time.getNome())) {
            times.add(time);
        }
    }

    public Double valorMovimentado() {
        Double valorMovimento = 0.0;

        for (int i = 0; i < times.size(); i++) {
            valorMovimento += times.get(i).getRendaTotal();
        }
        return valorMovimento;
    }

}
