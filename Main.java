import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Sistema POO em Java: Compra de Pssagem de Ônibus
public class Main {
  public static void main(String[] args) {

      // 0 - Simular cliente
      Usuario usuario = new Usuario(
        "Lucas",
        "lucas@email.com",
        "99999-8888",
        "123.456.789-00",
        new Date(),
        PermissaoUsuario.CLIENTE
        );

        System.out.println(usuario.getDetalhes());


      // 1 - Simular destinos
      Destino destino1 = new Destino(
        "São Paulo",
        "Rio de Janeiro",
        true,
        false
        ); // Ida
      Destino destino2 = new Destino(
        "São Paulo",
        "Belo Horizonte",
        true,
        false
        ); // Ida

      // 2 - Simular escolha de assentos
      Assento assento1 = new Assento(10);
      Assento assento2 = new Assento(15);

      // 3 - Simular passagens com assentos
      Passagem passagem1 = new Passagem(
        destino1,
        TipoPassagem.EXECUTIVA,
        0,
        assento1
        );
      Passagem passagem2 = new Passagem(
        destino2,
        TipoPassagem.VIP,
        0,
        assento2
        );

      // 4 - Agrupar lista de passagens para permitir compra de múltiplas passagens
      List<Passagem> passagens = new ArrayList<>();
      passagens.add(passagem1);
      passagens.add(passagem2);

      // 5 - Simular pedido
      Pedido pedido = new Pedido(usuario, passagens);

      // 6 - Aplicar cupom de desconto
      Cupom cupom = new Cupom("DESCONTO10", 10);
      pedido.aplicarCupom(cupom);

      // 7 - Realizar a compra com pagamento à vista
      FormaDePagamento pagamentoAVista = new PagamentoAVista();
      pedido.realizarPagamento(pagamentoAVista);

      // 8 - Exibindo os detalhes da compra
      pedido.exibirDetalhesCompra();
  }
}