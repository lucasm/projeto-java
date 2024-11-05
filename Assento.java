public class Assento {
  private int numero;
  private boolean disponivel;

  public Assento(int numero) {
      this.numero = numero;
      this.disponivel = true; // Inicialmente disponível
  }

  public int getNumero() {
      return numero;
  }

  public boolean isDisponivel() {
      return disponivel;
  }

  public void reservar() {
      if (disponivel) {
          disponivel = false;
      } else {
          System.out.println("Assento já está reservado.");
      }
  }

  @Override
  public String toString() {
      return "Assento número: " + numero + " - " + (disponivel ? "Disponível" : "Reservado");
  }
}
