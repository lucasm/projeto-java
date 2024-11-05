import java.util.List;
import java.util.UUID;

// Classe Pedido para gerenciar uma compra e gerar número de pedido
public class Pedido {
  private String numeroPedido;
  private Usuario usuario;
  private List<Passagem> passagens;
  private FormaDePagamento formaDePagamento;
  private double valorTotal;
  private Cupom cupom;

  public Pedido(Usuario usuario, List<Passagem> passagens) {
      this.numeroPedido = UUID.randomUUID().toString();  // Gera um identificador único para o pedido
      this.usuario = usuario;
      this.passagens = passagens;
      calcularValorTotal();
  }

  public String getNumeroPedido() {
      return numeroPedido;
  }

  private void calcularValorTotal() {
      valorTotal = passagens.stream().mapToDouble(Passagem::getPreco).sum();
      if (cupom != null) {
          valorTotal = cupom.aplicarDesconto(valorTotal);
      }
  }

  public void aplicarCupom(Cupom cupom) {
      this.cupom = cupom;
      calcularValorTotal();
  }



  public void realizarPagamento(FormaDePagamento formaDePagamento) {
    this.formaDePagamento = formaDePagamento;
    try {
        formaDePagamento.realizarPagamento(valorTotal);
        System.out.println("#### Compra realizada com sucesso. Número do pedido: " + numeroPedido);
    } catch (IllegalArgumentException e) {
        System.out.println("#### Erro ao realizar pagamento: " + e.getMessage());
    }
}


  public void exibirDetalhesCompra() {
    System.out.println("\n--- Detalhes da Compra ---");
    System.out.println("Número do Pedido: " + numeroPedido);
    System.out.println("Usuário: " + usuario);

    System.out.println("\nPassagens Compradas:");
    for (Passagem passagem : passagens) {
        System.out.println("\n - " + passagem);
    }

    if (cupom != null) {
        System.out.println("\nCupom Aplicado: " + cupom.getCodigo() + " (" + cupom.getDescontoPercentual() + "% de desconto)");
    } else {
        System.out.println("\nNenhum cupom de desconto foi aplicado.");
    }

    System.out.println("\nForma de Pagamento: " + (formaDePagamento != null ? formaDePagamento.getDescricao() : "Não especificada"));
    System.out.println("Valor Total: R$" + valorTotal);
    System.out.println("------------------------\n");
}

}
