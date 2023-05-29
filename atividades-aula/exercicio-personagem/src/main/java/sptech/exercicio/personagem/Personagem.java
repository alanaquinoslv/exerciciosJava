package sptech.exercicio.personagem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alan
 */
public abstract class Personagem {

    protected String codinome;
    protected String nome;
    protected List<SuperPoder> poderes;

   public Personagem(String codinome, String nome) {
    this.codinome = codinome;
    this.nome = nome;
    this.poderes = new ArrayList<>();
  }
  
  public void adicionaPoder(String nome, int categoria) {
    SuperPoder superPoder = new SuperPoder(nome, categoria);
    poderes.add(superPoder);
  }
  
  public abstract double getForcaTotal();
  
  public String getCodinome() {
    return codinome;
  }
  
  public String getNome() {
    return nome;
  }
  
  public List<SuperPoder> getPoderes() {
    return poderes;
  }
  
  @Override
  public String toString() {
    return "Personagem{" + "codinome='" + codinome + '\'' + ","
            + " nome='" + nome + '\'' + ", poderes=" + poderes + '}';
  }
    
    
}
