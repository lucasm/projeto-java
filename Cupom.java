// Classe Cupom
public class Cupom {
  private String codigo;
  private double descontoPercentual;

  public Cupom(String codigo, double descontoPercentual) {
      this.codigo = codigo;
      this.descontoPercentual = descontoPercentual;
  }

  public String getCodigo() {
      return codigo;
  }

  public double getDescontoPercentual() {
      return descontoPercentual;
  }

  public double aplicarDesconto(double valor) {
      return valor - (valor * descontoPercentual / 100);
  }
}

