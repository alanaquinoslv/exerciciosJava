package sptech.ac2.segunda.atividade;

/**
 *
 * @author alan
 */
//Atributos
//Construtor
//Métodos/comportamento
//Métodos get e set
//Método toString
public class Atividade {

    static void add(Atividade atv01) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String nomeAtividade;
    private String responsavel;
    private Integer diasEstimados;
    private Integer diasUsados;

    public Atividade(String nomeAtividade, String responsavel, Integer diasEstimados) {
        this.nomeAtividade = nomeAtividade;
        this.responsavel = responsavel;
        this.diasEstimados = diasEstimados;
        this.diasUsados = 0;
    }

    public String getNomeAtividade() {
        return nomeAtividade;
    }

    public void setNomeAtividade(String nomeAtividade) {
        this.nomeAtividade = nomeAtividade;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public Integer getDiasEstimados() {
        return diasEstimados;
    }

    public void setDiasEstimados(Integer diasEstimados) {
        this.diasEstimados = diasEstimados;
    }

    public Integer getDiasUsados() {
        return diasUsados;
    }

    public void terminarAtividades(Integer diasUtilizados) {

        if (diasUsados < 1) {
            diasUsados = diasUtilizados;
        }
//        this.diasUsados = diasUsados;
    }

    public void calcularTempo() {

        if (diasUsados > diasEstimados) {

            Integer diasMais = (diasUsados - diasEstimados);

            System.out.println(String.format("Você estimou %d dias, mas a tarefa foi"
                    + " feita em %d dias (%d  dias a mais que o estimado). \n"
                    + "Melhore a estimativa.",
                    diasEstimados, diasUsados, diasMais));
        } else if (diasUsados < diasEstimados) {

            Integer diasMenos = (diasEstimados - diasUsados);

            System.out.println(String.format("Você estimou %d dias, mas a tarefa foi"
                    + " feita em %d dias (%d  dias a menos que o estimado). \n"
                    + "Parabéns!",
                    diasEstimados, diasUsados, diasMenos));
        } else {
            System.out.println(String.format("Você "
                    + "estimou %d dias, e a tarefa foi feita em %d dias, atendendo a estimativa\n"
                    + "com precisão",
                    diasEstimados, diasUsados));
        }

    }

    @Override
    public String toString() {

        String fraseFormatada = String.format("Atividade: %s \n"
                + "Responsável: %s \n"
                + "Dias estimados: %d \n"
                + "Dias usados: %d \n",
                nomeAtividade, responsavel, diasEstimados, diasUsados);

        return fraseFormatada;
    }

}
