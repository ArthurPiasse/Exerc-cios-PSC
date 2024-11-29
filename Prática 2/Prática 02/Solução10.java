//10) Entrar com um número e informar se ele é ou não divisível por 5.

import javax.swing.JOptionPane;

public class Solução10
{
    public static void main(String[] args) 
    {
        String sNumero = JOptionPane.showInputDialog("Insira um número: ");
        double n1 = Double.parseDouble(sNumero);

        //verificar se é ou não divisível por 5
        if (n1 % 5 == 0 )
        {
            JOptionPane.showMessageDialog(null, n1 + " é divisível por 5.");
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, n1 + " não é divisível por 5.");
        }
    }
}