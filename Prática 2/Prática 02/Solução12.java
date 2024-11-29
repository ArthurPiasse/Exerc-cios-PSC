//12) Entrar com um número e informar se ele é divisível por 10, por 5, por 2 ou se não é divisível por nenhum destes.

import javax.swing.JOptionPane;

public class Solução12
{
    public static void main(String[] args) 
    {
        String numeroStr = JOptionPane.showInputDialog("Digite um número:");
        int numero = Integer.parseInt(numeroStr);

        // Verificando a divisibilidade
        if (numero % 10 == 0) 
        {
            JOptionPane.showMessageDialog(null, numero + " é divisível por 10.");
        } 
        else if (numero % 5 == 0) 
        {
            JOptionPane.showMessageDialog(null, numero + " é divisível por 5.");
        } 
        else if (numero % 2 == 0) 
        {
            JOptionPane.showMessageDialog(null, numero + " é divisível por 2.");
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, numero + " não é divisível por 10, 5 ou 2.");
        }
    }
}