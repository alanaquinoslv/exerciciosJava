package controle.atividades;

/**
 *
 * @author Admin
 */
public class Atividade {

    private String nomeAtividade;
    private String responsavel;
    private Integer diasEstimados;
    private Integer diasUsados;

    public Atividade(String nomeAtividade, 
            String responsavel, 
            Integer diasEstimados) {
        this.nomeAtividade = nomeAtividade;
        this.responsavel = responsavel;
        this.diasEstimados = diasEstimados;
        this.diasUsados = 0;
    }

    public void terminarAtividade(Integer diasUsados) {
        if(diasUsados < 1){
            System.out.println("Informe um valor válido");
        }else{            
          this.diasUsados = diasUsados;  
        }        
    }

    public void calcularTempo() {
        if (diasUsados > diasEstimados) {
            System.out.println(String.format("Você estimou %d dias, "
                    + "mas a tarefa foi feita em %d dias "
                    + "(%d dias a mais que o estimado). "
                    + "Melhore a estimativa.",
                    diasEstimados, diasUsados, (diasUsados - diasEstimados)));
        } else if (diasEstimados > diasUsados) {
            System.out.println(String.format("Você estimou %d dias, "
                    + "e a tarefa foi feita em %d dias "
                    + "(%d dias a menos que o estimado).Parabéns!",
                    diasEstimados, diasUsados, (diasEstimados - diasUsados)));
        }else if(diasEstimados.equals(diasUsados)){
                System.out.println(String.format("Você estimou %d dias, "
                    + "e a tarefa foi feita em %d dias "
                    + "atendendo a estimativa com precisão.",
                    diasEstimados, diasUsados));
        }
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
    
    @Override
    public String toString() {
        return String.format("Atividade: "
                + "\nNome: %s"
                + "\nResponsável: %s"
                + "\nDias Usados: %d"
                + "\nDias Estimados: %d"
                + "\nDiferença: %d", 
                nomeAtividade, 
                responsavel, 
                diasUsados, 
                diasEstimados,
                (diasEstimados - diasUsados));
    }
}
