//11) Entrar com um número e informar se ele é divisível por 3 e por 7.

import javax.swing.JOptionPane;

public class Solução11 
{
    public static void main(String[] args) 
    {
        String sNumero = JOptionPane.showInputDialog("Digite um número:");
        int numero = Integer.parseInt(sNumero);

        // Verificando a divisibilidade
        if (numero % 3 == 0 && numero % 7 == 0) 
        {
            JOptionPane.showMessageDialog(null, numero + " é divisível por 3 e por 7.");
        } 
        else if (numero % 3 == 0) 
        {
            JOptionPane.showMessageDialog(null, numero + " é divisível apenas por 3.");
        } 
        else if (numero % 7 == 0) 
        {
            JOptionPane.showMessageDialog(null, numero + " é divisível apenas por 7.");
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, numero + " não é divisível por 3 nem por 7.");
        }
    }
}