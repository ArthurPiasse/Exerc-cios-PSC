//14) Ler um número inteiro de 4 casas e imprimir se é ou não múltiplo de quatro o número formado pelos algarismos que estão nas casas das unidades de milhar e das centenas.

import javax.swing.JOptionPane;

public class Solução14 
{
    public static void main(String[] args) 
    {
        String sNumero = JOptionPane.showInputDialog("Digite um número de 4 dígitos:");
        int numero = Integer.parseInt(sNumero);
        int milharesECentenas = numero / 10; 
        
        // Remove as unidades

        if (milharesECentenas % 4 == 0) 
        {
            JOptionPane.showMessageDialog(null, "O número formado pelas casas das milhares e centenas é múltiplo de 4.");
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "O número formado pelas casas das milhares e centenas não é múltiplo de 4.");
        }
    }
}