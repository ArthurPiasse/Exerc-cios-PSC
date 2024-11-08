public class CartaoDeCredito extends Pagamento {
    private String numeroDoCartao;

    public CartaoDeCredito(String nomeDoPagador, String cpf, double valorASerPago, String numeroDoCartao) {
        super(nomeDoPagador, cpf, valorASerPago);
        this.numeroDoCartao = numeroDoCartao;
    }

    public String getNumeroDoCartao() {
        return numeroDoCartao;
    }

    public void setNumeroDoCartao(String numeroDoCartao) {
        this.numeroDoCartao = numeroDoCartao;
    }

    public void exibirDetalhes() {
        JOptionPane.showMessageDialog(null, 
            "Pagamento com Cartão de Crédito\n" +
            "Pagador: " + getNomeDoPagador() + "\n" +
            "CPF: " + getCpf() + "\n" +
            "Valor: R$" + getValorASerPago() + "\n" +
            "Número do Cartão: " + numeroDoCartao);
    }
}
