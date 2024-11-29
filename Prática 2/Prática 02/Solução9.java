//9) Entrar com um número e imprimir uma das mensagens: é múltiplo de 3 ou não é.

import javax.swing.JOptionPane;

public class Solução9 
{
    public static void main(String[] args) 
    {
        //  Receber o número
        String numeroStr = JOptionPane.showInputDialog("Digite um número:");
        int numero = Integer.parseInt(numeroStr);

        // Verificando se o número é múltiplo de 3
        if (numero % 3 == 0) 
        {
            JOptionPane.showMessageDialog(null, numero + " é múltiplo de 3.");
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, numero + " não é múltiplo de 3.");
        }
    }
}