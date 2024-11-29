//19) Entrar com dois números e imprimi-los em ordem decrescente (suponha números diferentes).

import javax.swing.JOptionPane;

public class Solução19 
{
    public static void main(String[] args) 
    {
        String sNumero1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        String sNumero2 = JOptionPane.showInputDialog("Digite o segundo número:");
        int numero1 = Integer.parseInt(sNumero1);
        int numero2 = Integer.parseInt(sNumero2);

        // Imprimindo em ordem decrescente
        if (numero1 > numero2) 
        {
            JOptionPane.showMessageDialog(null, numero1 + ", " + numero2);
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, numero2 + ", " + numero1);
        }
    }
}