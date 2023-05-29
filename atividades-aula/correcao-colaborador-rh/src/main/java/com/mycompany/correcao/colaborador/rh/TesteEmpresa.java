package com.mycompany.correcao.colaborador.rh;

/**
 *
 * @author Admin
 */
public class TesteEmpresa {
    public static void main(String[] args) {
        
        Colaborador colab01 = new Colaborador("Giuliana", 
                                                "Estágio", 
                                                 2500.0);
 
        Colaborador colab02 = new Colaborador("Xampson", 
                                                "Dev Junior", 
                                                4500.0);
                
        RecursosHumanos rh = new RecursosHumanos();
                
//        colab01.exibirColaborador();
//        colab02.exibirColaborador();
        System.out.println(colab01);
        System.out.println(colab02);
        
        rh.promoverColaborador(colab01, "Dev Junior", 4500.0);
        rh.promoverColaborador(colab02, "Dev Pleno", 4000.0);
        
        rh.reajustarSalario(colab02, 500.0);

        
        //Ao invés de criar e chamar o método de exibir/
        //Podemos fazer print do objeto
        //porém para isso é necessário sobrescrever o toString na classe
        
//        colab01.exibirColaborador();
//        colab02.exibirColaborador();
        System.out.println(colab01.toString());
        System.out.println(colab02);
        
        System.out.println(rh);
                
    }
}
