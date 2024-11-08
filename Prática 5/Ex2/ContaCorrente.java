public class ContaCorrente {
    private int numero;
    private int digito;
    private Agencia agencia;
    private double saldo;

    public ContaCorrente(int numero, int digito, Agencia agencia, double saldoInicial) {
        this.numero = numero;
        this.digito = digito;
        this.agencia = agencia;
        this.saldo = saldoInicial;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getDigito() {
        return digito;
    }

    public void setDigito(int digito) {
        this.digito = digito;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        JOptionPane.showMessageDialog(null, "Depósito de R$" + valor + " realizado com sucesso!");
    }

    public double sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            JOptionPane.showMessageDialog(null, "Saque de R$" + valor + " realizado com sucesso!");
            return valor;
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente para o saque de R$" + valor);
            return 0;
        }
    }

    public void consultarSaldo() {
        JOptionPane.showMessageDialog(null, "Saldo atual: R$" + saldo);
    }

    public void imprimirSaldo() {
        JOptionPane.showMessageDialog(null,
                "Conta Corrente: " + numero + "-" + digito + "\n" +
                "Agência: " + agencia.getNumero() + "-" + agencia.getDigito() + "\n" +
                "Saldo: R$" + saldo);
    }

    public int calcularDigito() {
        int[] pesos = {4, 6, 8, 2};
        int soma = 0;
        String numeroStr = String.format("%04d", numero);

        for (int i = 0; i < numeroStr.length(); i++) {
            soma += Character.getNumericValue(numeroStr.charAt(i)) * pesos[i];
        }

        int resultado = soma % 11;
        return (resultado == 10) ? 0 : resultado;
    }
}
