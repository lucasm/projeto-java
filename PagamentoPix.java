// Implementação de Pagamento com Pix
class PagamentoPix implements FormaDePagamento {
  @Override
  public void realizarPagamento(double valor) {
      System.out.println("Pagamento de R$" + valor + " realizado com Pix.");
  }

  @Override
  public String getDescricao() {
      return "Pagamento com Pix -> powered by Banco Central";
  }
}