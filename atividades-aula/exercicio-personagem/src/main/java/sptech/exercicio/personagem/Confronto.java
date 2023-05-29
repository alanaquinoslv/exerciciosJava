package sptech.exercicio.personagem;

/**
 *
 * @author alan
 */
public class Confronto {

    public void lutar(Heroi heroi, Vilao vilao) {

        Double totalPoderesHeroi = heroi.getForcaTotal();
        Double totalPoderesVilao = vilao.getForcaTotal();

        if (totalPoderesHeroi > totalPoderesVilao) {
            System.out.println("O vencedor do combate é o " + heroi.getNome());
        } else if (totalPoderesHeroi < totalPoderesVilao) {
            System.out.println("O vencedor do combate é o " + vilao.getNome());
        } else {
            System.out.println("Empate!");
        }
    }
}
