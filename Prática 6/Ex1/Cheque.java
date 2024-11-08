public class Cheque extends Pagamento {
    private String numeroDoCheque;

    public Cheque(String nomeDoPagador, String cpf, double valorASerPago, String numeroDoCheque) {
        super(nomeDoPagador, cpf, valorASerPago);
        this.numeroDoCheque = numeroDoCheque;
    }

    public String getNumeroDoCheque() {
        return numeroDoCheque;
    }

    public void setNumeroDoCheque(String numeroDoCheque) {
        this.numeroDoCheque = numeroDoCheque;
    }

    public void exibirDetalhes() {
        JOptionPane.showMessageDialog(null, 
            "Pagamento com Cheque\n" +
            "Pagador: " + getNomeDoPagador() + "\n" +
            "CPF: " + getCpf() + "\n" +
            "Valor: R$" + getValorASerPago() + "\n" +
            "Número do Cheque: " + numeroDoCheque);
    }
}
