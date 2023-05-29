package sptech.lista.poo.encapsulamento;

/**
 *
 * @author alan
 */
public class RecursosHumanos {

//    não é boa praticar iniciar valor aqui e sim no construtor
    private Integer totalPromovidos;
    private Integer totalSalariosReajustados;

    public RecursosHumanos() {
        this.totalPromovidos = 0;
        this.totalSalariosReajustados = 0;
    }

    public void reajustarSalario(Colaborador colaborador, Double reajuste) {
        Double novoSalario = colaborador.getSalario() * (1 + reajuste);
        colaborador.setSalario(novoSalario);
        totalSalariosReajustados++;
    }

    public void promoverColaborador(Colaborador colaborador,
            String novoCargo, Double novoSalario) {
        if (novoSalario > colaborador.getSalario()) {
            colaborador.setSalario(novoSalario);
            colaborador.setCargo(novoCargo);
            totalPromovidos++;
        } else {
            System.out.println("Operação inválida.");
        }
    }

    public Integer getTotalPromovidos() {
        return totalPromovidos;
    }

    public Integer getTotalSalariosReajustados() {
        return totalSalariosReajustados;
    }

    @Override
    public String toString() {
        return String.format("RH: \n"
                + "Total promovidos: %d \n"
                + "Total reajustes: %d",
                totalPromovidos, totalSalariosReajustados);
    }
    
    

}
