import javax.swing.JOptionPane;

public class TesteProduto 
{
    public static void main(String[] args) 
    {
        String nome = JOptionPane.showInputDialog("Digite o nome do produto:");
        String precoString = JOptionPane.showInputDialog("Digite o preço do produto:");
        String quantidadeString = JOptionPane.showInputDialog("Digite a quantidade do produto:");

        double preco = Double.parseDouble(precoString);
        int quantidade = Integer.parseInt(quantidadeString);

        Produto produto = new Produto(nome, preco, quantidade);

        produto.exibirInformacoes();
    }
}