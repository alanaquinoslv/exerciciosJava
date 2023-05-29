package sptech.exemplo.classe.abstrata;

/**
 *
 * @author alan
 */
public class Bicicleta extends Veiculo {

    private Integer calibragemPneu;
    private Double pesoCiclista;

    //CONSTRUTOR NÃO É HERDADO
//    é considerado um membro privado da classe e, portanto, não pode ser acessado fora da classe. 
//    Por esse motivo, as subclasses precisam definir seus próprios construtores para inicializar
//            suas variáveis ​​e chamar o construtor da superclasse para inicializar os membros da superclasse.
    public Bicicleta(Integer calibragemPneu, Double pesoCiclista,
            String proprietario, Integer anoFabricacao, String marca) {
        super(proprietario, anoFabricacao, marca);
        this.calibragemPneu = calibragemPneu;
        this.pesoCiclista = pesoCiclista;
    }

    @Override
    public void relatorioDeRevisao() {
        System.out.println("Exibindo relatório da bike: " + proprietario);
        if (pesoCiclista == 85.0 && calibragemPneu != 36) {
            System.out.println("Precisa calibrar o pneu.");
        }
        else  {
            System.out.println("Calibragem ok.");
        }
    }

    public Integer getCalibragemPneu() {
        return calibragemPneu;
    }

    public void setCalibragemPneu(Integer calibragemPneu) {
        this.calibragemPneu = calibragemPneu;
    }

    public Double getPesoCiclista() {
        return pesoCiclista;
    }

    public void setPesoCiclista(Double pesoCiclista) {
        this.pesoCiclista = pesoCiclista;
    }

}
