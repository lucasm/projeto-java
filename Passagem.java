// Enum para Tipos de Passagem
enum TipoPassagem {
  EXECUTIVA, VIP
}

// Classe Passagem com Tipo de Passagem
public class Passagem {
  private Destino destino;
  private TipoPassagem tipo;
  private double preco;
  private Assento assento;

  public Passagem(Destino destino, TipoPassagem tipo, double preco, Assento assento) {
      this.destino = destino;
      this.tipo = tipo;
      this.preco = preco;
      this.assento = assento;
      this.assento.reservar(); // Reserva o assento ao criar a passagem
  }

  public Destino getDestino() {
      return destino;
  }

  public double getPreco() {
      return preco;
  }

  public Assento getAssento() {
      return assento;
  }

  @Override
  public String toString() {
      return destino.toString() + "Tipo: " + tipo + "\nPreço: R$" + preco + "\n" + assento.toString();
  }
}
