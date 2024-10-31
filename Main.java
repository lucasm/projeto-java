public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("João", "joao@email.com");
        Passagem passagem = new Passagem("São Paulo", "Rio de Janeiro", 150.0, "2024-11-15");
        Onibus onibus = new Onibus("Mercedes", 40);

        CompraDePassagem compra = new CompraDePassagem(usuario, passagem, onibus);
        compra.selecionarAssento(10);

        // Realiza a compra com pagamento via cartão de crédito
        FormaDePagamento pagamentoCartao = new PagamentoCartaoCredito();
        compra.realizarCompra(pagamentoCartao);
    }
}

