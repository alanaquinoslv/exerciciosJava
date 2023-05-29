package sptech.primeiro.projeto.poo;

/**
 *
 * @author alan
 */
public class App {

    public static void main(String[] args) {

        // instanciar um objeto 
        BilheteUnico bilheteAlan = new BilheteUnico();
        BilheteUnico bilheteXamp = new BilheteUnico();

        //comportamentos e caracteristicas iguais, mas com valores diferentes
        bilheteAlan.nomeTitular = "Alan Aquino";
        bilheteAlan.possuiMeiaTarifa = true;
        bilheteAlan.saldo = 0.0;

        bilheteXamp.nomeTitular = "Xampson";
        bilheteXamp.possuiMeiaTarifa = false;
        bilheteXamp.saldo = 0.0;
        
        //recarregar
        //bilhete01
        bilheteAlan.recarregar(50.0);
        bilheteAlan.usar();
        
        //bilhete02
        bilheteXamp.recarregar(3.0);
        bilheteXamp.usar();
    }
}
