package sptech.exemplo.relacionamento;

/**
 *
 * @author alan
 */
public class WhatsApp {

    public static void main(String[] args) {
        Contato contato01 = new Contato("Alan", "(11)-9673-2311");
        Contato contato02 = new Contato("João", "(13)-95432-9023");
        Contato contato03 = new Contato("Maria", "(11)-2712-4654");

        Grupo grupo01 = new Grupo("Trabalho");
        grupo01.adicionar(contato03);
        grupo01.adicionar(contato02);

        Grupo grupo02 = new Grupo("Amigos");
        grupo02.adicionar(contato01);
        
        System.out.println(grupo01);
        System.out.println(grupo02);
    }
}
