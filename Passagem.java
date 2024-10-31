// Classe de Passagem
public class Passagem {
  private String origem;
  private String destino;
  private double preco;
  private String data;

  public Passagem(String origem, String destino, double preco, String data) {
      this.origem = origem;
      this.destino = destino;
      this.preco = preco;
      this.data = data;
  }

  public double getPreco() {
      return preco;
  }
}