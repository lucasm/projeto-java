public class Main {
    public static void main(String[] args) {

        // 1 - Simula usuário logado
        Usuario usuario = new Usuario("Lucas", "lucas@email.com");

        // 2 - Simula preencher passagem
        Passagem passagem = new Passagem("Belém", "Belo Horizonte", 150.0, "2024-11-15");

        // 3 - Simula ônibus
        Onibus onibus = new Onibus("Mercedes", 40);

        // 4 - Simula compra de passagem
        CompraDePassagem compra = new CompraDePassagem(usuario, passagem, onibus);
        compra.selecionarAssento(10);

        // 5 - Simula pagamento com Cartão de Crédito
        FormaDePagamento pagamentoCartao = new PagamentoCartaoCredito();
        compra.realizarCompra(pagamentoCartao);
    }
}

