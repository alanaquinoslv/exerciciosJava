package sptech.lista.poo.encapsulamento;

/**
 *
 * @author alan
 */
public class TreinadorPokemon {
    
    private String nome;
    private Integer nivel = 0;
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Integer getNivel() {
        return nivel;
    }
    
    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }
    
    public void treinarPokemon(Pokemon pokemon) {
        Double novaForca = pokemon.getForca() * 1.1;
        Integer novaQtdDoces = pokemon.getDoces() + 10;
        
        pokemon.setForca(novaForca);
        pokemon.setDoces(novaQtdDoces);
        
        this.nivel += 2;
    }
    
    public void evoluirPokemon(Pokemon pokemon, String Evolucao) {
        if (pokemon.getDoces() >= 50) {
            Integer novaQtdDoces = (pokemon.getDoces() - 50);
            pokemon.setDoces(novaQtdDoces);
            this.nivel += 10;
            
            System.out.println(String.format("------------------------------------------ \n"
                    + "O pokémon %s evoluiu para ->"
                    + " %s \n"
                    + "------------------------------------------", pokemon.getNome(), Evolucao));
            
            pokemon.setNome(Evolucao);
        } else {
            System.out.println("Não foi possível realizar a operação.");
        }
        
    }
}
