//16) Crie um algoritmo que leia dois números e imprimir uma mensagem dizendo se são iguais ou diferentes.

import javax.swing.JOptionPane;

public class Solução16 
{
    public static void main(String[] args) 
    {
        String sNumero1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        String sNumero2 = JOptionPane.showInputDialog("Digite o segundo número:");
        int numero1 = Integer.parseInt(sNumero1);
        int numero2 = Integer.parseInt(sNumero2);

        // Comparação
        if (numero1 == numero2) 
        {
            JOptionPane.showMessageDialog(null, "Os números são iguais.");
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "Os números são diferentes.");
        }
    }
}