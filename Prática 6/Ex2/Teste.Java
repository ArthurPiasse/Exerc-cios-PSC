import javax.swing.JOptionPane;

public class Teste {
    public static void main(String[] args) {
        Desempregado desempregado = new Desempregado("Carlos", "Silva", "123.456.789-00", 1200.00);
        Mensalista mensalista = new Mensalista("Ana", "Santos", "987.654.321-00", 3000.00);
        Horista horista = new Horista("Pedro", "Souza", "555.666.777-88", 160, 20.00);
        Tarefeiro tarefeiro = new Tarefeiro("João", "Oliveira", "222.333.444-55", 50.00, 20);
        Vendedor vendedor = new Vendedor("Maria", "Pereira", "333.222.111-99", 2500.00, 800.00);

        JOptionPane.showMessageDialog(null, desempregado.dados());
        JOptionPane.showMessageDialog(null, mensalista.dados());
        JOptionPane.showMessageDialog(null, horista.dados());
        JOptionPane.showMessageDialog(null, tarefeiro.dados());
        JOptionPane.showMessageDialog(null, vendedor.dados());
    }
}
