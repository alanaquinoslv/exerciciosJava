package controle.atividades;

/**
 *
 * @author Admin
 */
public class AtividadeTeste {
    public static void main(String[] args) {
        Atividade ativ01 = new Atividade("Preparar Aula", "Giuliana", 10);
        Atividade ativ02 = new Atividade("Tirar Música", "William", 6);
        Atividade ativ03 = new Atividade("Pintar as paredes de casa", "Xampson", 2);
        
        ativ01.terminarAtividade(10);
        ativ02.terminarAtividade(3);
        ativ03.terminarAtividade(6);
        
        ativ01.calcularTempo();
        ativ02.calcularTempo();
        ativ03.calcularTempo();
        
        System.out.println(ativ01);
        System.out.println(ativ02.toString());
        System.out.println(ativ03);
        
        
        
        
        
    }
}
