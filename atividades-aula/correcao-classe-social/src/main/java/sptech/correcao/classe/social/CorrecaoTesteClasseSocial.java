package sptech.correcao.classe.social;

import java.util.Scanner;

/**
 *
 * @author alan
 */
public class CorrecaoTesteClasseSocial {

    public static void main(String[] args) {

        // instanciar igual scanner
        CorrecaoClasseSocial classe = new CorrecaoClasseSocial();
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua renda:");
        Double rendaDigitada = scan.nextDouble();

        Double qtdSalario = classe.calcularQtdSalarios(rendaDigitada);
        String classeSocial = classe.IdentificarClasse(qtdSalario); //nao precisa ser esse argumento, pois os metodos nao se ligam
        
        classe.exibirRelatorioClasseSocial(qtdSalario, classeSocial);
    }
}
