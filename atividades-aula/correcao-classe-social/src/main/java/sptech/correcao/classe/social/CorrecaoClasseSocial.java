package sptech.correcao.classe.social;

/**
 *
 * @author alan
 */
public class CorrecaoClasseSocial {

    //assinatura:
    Double calcularQtdSalarios(Double renda) {
        Double qtdSalarios = renda / 1045.0;
        return qtdSalarios;
    }

    //sobrecarga
    // metodo que faz as mesmas coisas com argumentos diferentes
    Double calcularQtdSalarios(Double renda, Double salarioMin) {
        return renda / salarioMin;
    }

    //variavel so existe no corpo do metodo em que foi criado
    String IdentificarClasse(Double qtdSalarios) {

        String classe;
        if (qtdSalarios > 20) {
            classe = "A";
        } else if (qtdSalarios >= 10 && qtdSalarios <= 20) {
            classe = "B";
        } else if (qtdSalarios >= 4 && qtdSalarios <= 10) {
            classe = "C";
        } else if (qtdSalarios >= 2 && qtdSalarios < 4) {
            classe = "D";
        } else {
            classe = "D";
        }

        return classe;

    }

    void exibirRelatorioClasseSocial(Double qtdSalario, String classeSocial) {
        
        System.out.println(String.format("Você recebe aproximadamente %.1f "
                + "sálarios mínimos", qtdSalario));

        System.out.println("Classe social: " + classeSocial);
    }
}
