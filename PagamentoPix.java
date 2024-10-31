// Implementação de Pagamento com Pix
public class PagamentoPix implements FormaDePagamento {
  @Override
  public void realizarPagamento(double valor) {
      System.out.println("Pagamento de R$" + valor + " realizado com Pix.");
  }
}