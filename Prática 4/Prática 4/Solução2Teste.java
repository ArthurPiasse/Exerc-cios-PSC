import javax.swing.JOptionPane;

public class Solução2Teste 
{
    public static void main(String[] args) 
    {
        String nome = JOptionPane.showInputDialog("Digite o seu nome");
        Double preco = Double.valueOf(JOptionPane.showInputDialog("Digite o seu preco"));
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade"));

        Solução2 produto = new Solução2(nome, preco, quantidade);

        JOptionPane.showMessageDialog(null, produto.getNome() + "\n" + produto.getPreco() + "\n" + produto.getQuantidade());

    }
}