package sptech.classe.abstrata.tema;

/**
 *
 * @author alan
 */
public class AtletaCorredor extends Atleta {

    private int velocidadeMaxima;

    public AtletaCorredor(String nome, int idade, int velocidadeMaxima) {
        super(nome, idade);
        this.velocidadeMaxima = velocidadeMaxima;
    }

    @Override
    public void treinar() {
        System.out.println("O atleta " + nome + " está correndo para aumentar sua velocidade.");
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }
}
