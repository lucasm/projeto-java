// Implementação de Pagamento com Cartão de Crédito
public class PagamentoCartaoCredito implements FormaDePagamento {
  @Override
  public void realizarPagamento(double valor) {
      System.out.println("Pagamento de R$" + valor + " realizado com cartão de crédito.");
  }

  @Override
  public String getDescricao() {
      return "Pagamento com Cartão de Crédito";
  }
}
