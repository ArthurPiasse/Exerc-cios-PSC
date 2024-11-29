//18) Entrar com dois números e imprimi-los em ordem crescente (suponha números diferentes)

import javax.swing.JOptionPane;

public class Solução18 
{
    public static void main(String[] args) 
    {
        String sNumero1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        String sNumero2 = JOptionPane.showInputDialog("Digite o segundo número:");
        int numero1 = Integer.parseInt(sNumero1);
        int numero2 = Integer.parseInt(sNumero2);
        

        // Imprimindo em ordem crescente
        if (numero1 < numero2) 
        {
            JOptionPane.showMessageDialog(null, "A ordem crescente dos números são: " + numero1 + ", " + numero2);
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "A ordem crescente dos números são: " + numero2 + ", " + numero1);
        }
    }
}