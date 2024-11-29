import javax.swing.JOptionPane;

public class Solução24 
{
    public static void main(String[] args) 
    {
        double total = 0;

        do {
            String sPreco = JOptionPane.showInputDialog("Digite o preço da mercadoria (ou 0 para finalizar):");
            String sQuantidade = JOptionPane.showInputDialog("Digite a quantidade de itens:");

            try 
            {
                double preco = Double.parseDouble(sPreco);
                int quantidade = Integer.parseInt(sQuantidade);

                if (preco < 0 || quantidade < 0) 
                {
                    JOptionPane.showMessageDialog(null, "Preço e quantidade devem ser positivos.");
                } 
                else 
                {
                    total += preco * quantidade;
                }
            } 
            catch (NumberFormatException e) 
            {
                JOptionPane.showMessageDialog(null, "Digite apenas números para o preço e a quantidade.");
            }
        } 
        while (!sQuantidade.equals("0")); // Corrigido para usar sQuantidade

        JOptionPane.showMessageDialog(null, "O valor total a ser pago é: R$" + total);
    }
}