
public class CaixaEletronico {
    public static void main(String[] args) {
        // Cria Agência
        Agencia agencia = new Agencia("Agência Central", 7890, 5);

        // Cria ContaCorrente
        ContaCorrente conta = new ContaCorrente(1234, 4, agencia, 150.00);

        // Cria Cliente
        Cliente cliente = new Cliente("Ademar Apior", "123231518-12", conta);

        // Operações
        conta.sacar(140.0);          // Saque de 140.0
        conta.consultarSaldo();       // Consulta saldo (deve ser 10.0)
        
        conta.sacar(200.0);           // Saque de 200.0 (falha)
        conta.consultarSaldo();       // Consulta saldo (deve ser 10.0)
        
        conta.depositar(25.45);       // Depósito de 25.45
        conta.imprimirSaldo();        // Imprime saldo e dados da conta (deve ser 35.45)
    }
}
