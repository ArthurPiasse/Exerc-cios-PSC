//13) Entrar com um número e verificar se ele é um número primo.

import javax.swing.JOptionPane;

public class Solução13 
{
    public static void main(String[] args) 
    {
        int numero, i;
        boolean ehPrimo = true;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        // 1 e números negativos não são primos
        if (numero <= 1) 
        {
            ehPrimo = false;
        } 
        else 
        {
            for (i = 2; i <= Math.sqrt(numero); i++) 
            {
                if (numero % i == 0) 
                {
                    ehPrimo = false;
                    break;
                }
            }
        }

        if (ehPrimo) 
        {
            JOptionPane.showMessageDialog(null, numero + " é um número primo.");
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, numero + " não é um número primo.");

        }
    }
}