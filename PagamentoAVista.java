public class PagamentoAVista implements FormaDePagamento {
  @Override
  public void realizarPagamento(double valor) {
      if (valor <= 0) {
          throw new IllegalArgumentException("O valor do pagamento deve ser maior que zero.");
      }
      System.out.println("Pagamento de R$" + valor + " realizado à vista.");
  }

  @Override
  public String getDescricao() {
      return "Pagamento à Vista";
  }
}
