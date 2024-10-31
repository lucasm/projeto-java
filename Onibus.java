// Classe Onibus
public class Onibus {
  private String modelo;
  private int capacidade;
  private boolean[] assentosDisponiveis;

  public Onibus(String modelo, int capacidade) {
      this.modelo = modelo;
      this.capacidade = capacidade;
      this.assentosDisponiveis = new boolean[capacidade];
      // Inicializa todos os assentos como disponíveis
      for (int i = 0; i < capacidade; i++) {
          assentosDisponiveis[i] = true;
      }
  }

  public boolean verificarDisponibilidade(int assento) {
      return assentosDisponiveis[assento];
  }

  public void reservarAssento(int assento) {
      if (assentosDisponiveis[assento]) {
          assentosDisponiveis[assento] = false;
      } else {
          System.out.println("Assento já reservado.");
      }
  }
}
