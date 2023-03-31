package sptech.ac2.segunda.atividade.petshop;

/**
 *
 * @author alan
 */
public class TestePetShop {

    public static void main(String[] args) {
        Pet pet01 = new Pet("Bidu", "Shitzu", 2, 30.0);
        Pet pet02 = new Pet("Bethoven", "Akita", 2, 30.0);

        PetShop amigoPet = new PetShop("AmigoPet");

        amigoPet.darBanho(pet01, 50.0);
        amigoPet.darBanho(pet02, 50.0, 50);

        System.out.println(pet01);
        System.out.println(pet02);
        System.out.println(amigoPet);
    }
}
