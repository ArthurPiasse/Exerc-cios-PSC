//1) Imprimir na tela todos os números de 100 a 1 (contagem regressiva).

import javax.swing.JOptionPane;

public class Solução1 
{
    public static void main(String[] args) 
    {
        for (int i = 100; i >= 1; i--) 
        {
            JOptionPane.showMessageDialog(null, i);
        }
    }
}