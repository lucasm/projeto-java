// Interface para diferentes formas de pagamento
interface FormaDePagamento {
    void realizarPagamento(double valor);
    String getDescricao();  // Método para obter a descrição de cada forma de pagamento individual
}