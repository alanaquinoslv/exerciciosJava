package sptech.lista.poo.encapsulamento;

/**
 *
 * @author alan
 */
public class TestePokemon {

    public static void main(String[] args) {
        Pokemon pokemon01 = new Pokemon();
        Pokemon pokemon02 = new Pokemon();

        pokemon01.setNome("Koffing");
        pokemon01.setTipo("Venenoso");
        pokemon01.setForca(67.5);
        pokemon01.setDoces(27);

        pokemon02.setNome("Voltorb");
        pokemon02.setTipo("Elétrico");
        pokemon02.setForca(34.0);
        pokemon02.setDoces(50);

        TreinadorPokemon treinador = new TreinadorPokemon();
        treinador.setNome("Lance");

        System.out.println(String.format("Pokémon: %s \n"
                + "Tipo: %s \n"
                + "Força %.1f \n"
                + "Doces: %d \n"
                + "-------------------------", pokemon02.getNome(), pokemon02.getTipo(),
                pokemon02.getForca(), pokemon02.getDoces()));

        for (int i = 0; i < 7; i++) {
            treinador.treinarPokemon(pokemon02);
        }

        treinador.evoluirPokemon(pokemon02, "Electrode");

        System.out.println(String.format("Pokémon: %s \n"
                + "Tipo: %s \n"
                + "Força %.1f \n"
                + "Doces: %d \n"
                + "-------------------------", pokemon02.getNome(), pokemon02.getTipo(),
                pokemon02.getForca(), pokemon02.getDoces()));

        System.out.println(String.format("Pokémon: %s \n"
                + "Tipo: %s \n"
                + "Força %.1f \n"
                + "Doces: %d \n"
                + "-------------------------", pokemon01.getNome(), pokemon01.getTipo(),
                pokemon01.getForca(), pokemon01.getDoces()));

        for (int i = 0; i < 2; i++) {
            treinador.treinarPokemon(pokemon01);
        }

        System.out.println(String.format("Pokémon: %s \n"
                + "Tipo: %s \n"
                + "Força %.1f \n"
                + "Doces: %d \n"
                + "-------------------------", pokemon01.getNome(), pokemon01.getTipo(),
                pokemon01.getForca(), pokemon01.getDoces()));

        treinador.evoluirPokemon(pokemon01, "Weezing");

        System.out.println(String.format("***STATUS DO TREINADOR *** \n"
                + "Nome: %s \n"
                + "Nível: %s    ", treinador.getNome(), treinador.getNivel()));
    }
}
