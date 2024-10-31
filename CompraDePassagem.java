// Classe CompraDePassagem para gerenciar a compra
public class CompraDePassagem {
  private Usuario usuario;
  private Passagem passagem;
  private FormaDePagamento formaDePagamento;
  private Onibus onibus;
  private int assentoSelecionado;

  public CompraDePassagem(Usuario usuario, Passagem passagem, Onibus onibus) {
      this.usuario = usuario;
      this.passagem = passagem;
      this.onibus = onibus;
  }

  public void selecionarAssento(int assento) {
      if (onibus.verificarDisponibilidade(assento)) {
          assentoSelecionado = assento;
          onibus.reservarAssento(assento);
          System.out.println("Assento " + assento + " reservado.");
      } else {
          System.out.println("Assento indisponível.");
      }
  }

  public void realizarCompra(FormaDePagamento formaDePagamento) {
      this.formaDePagamento = formaDePagamento;
      formaDePagamento.realizarPagamento(passagem.getPreco());
      System.out.println("Compra de passagem realizada com sucesso.");
  }
}
