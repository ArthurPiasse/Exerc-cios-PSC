//7) Imprimir na tela todos os números múltiplos de 5, no intervalo de 1 a 500.

import javax.swing.JOptionPane;

public class Solução7 
{
    public static void main(String[] args) 
    {
        for (int i = 5; i <= 500; i += 5) 
        {
            JOptionPane.showMessageDialog(null, i);
        }
    }
}