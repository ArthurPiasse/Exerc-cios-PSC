//2) Imprimir na tela os 100 primeiros números pares.

import javax.swing.JOptionPane;

public class Solução2 
{
    public static void main(String[] args) 
    {
        for (int i = 2; i <= 200; i += 2) 
        {
            JOptionPane.showMessageDialog(null, i);
        }
    }
}