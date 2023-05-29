package carros;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alan
 */
public class TesteCarro {

    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<>();

        Carro carro01 = new Carro("Cerato SX3", 36000.0, 2012, "Kia Motors");
        Carro carro02 = new Carro("3008", 250000.0, 2023, "Peugeot");
        Carro carro03 = new Carro("M3", 150000.0, 2010, "BMW");
        Carro carro04 = new Carro("Sandero RS", 130000.0, 2022, "Renault");
        Carro carro05 = new Carro("Bronco", 210000.0, 2021, "Ford");
        Carro carro06 = new Carro("Rio", 55000.0, 2020, "Kia Motors");

        carros.add(carro01);
        carros.add(carro02);
        carros.add(carro03);
        carros.add(carro04);
        carros.add(carro05);
        carros.add(carro06);
        
        // ADD TUDO DE UMA VEZ
//        carros.addAll(List.of(carro01, carro02, carro03, carro04, carro05, carro06));
        System.out.println("-------------------------------------------- \n"
                + "Carros com ano maior que 2018: "
                + " \n --------------------------------------------");

        for (Carro carroMaiorQue2018 : carros) {
            if (carroMaiorQue2018.getAno() > 2018) {
                System.out.println(carroMaiorQue2018);
            }
        }

        System.out.println("-------------------------------------------- \n"
                + "Carros com valores acima de 60k: "
                + "\n --------------------------------------------");
        for (Carro carroMaiorQue60K : carros) {
            if (carroMaiorQue60K.getValor() > 60000.0) {
                System.out.println(carroMaiorQue60K);
            }
        }

        System.out.println("-------------------------------------------- \n"
                + "Carros Kia Motors: "
                + "\n --------------------------------------------");
        for (Carro carrosKia : carros) {
            if (carrosKia.getMarca().equals("Kia Motors")) {
                System.out.println(carrosKia);
            }
        }
    }
}
