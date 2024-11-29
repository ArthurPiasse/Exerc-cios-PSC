//6) Ler vários números até entrar o número -999. Para cada número, imprimir sua raiz quadrada e seu inverso.

import javax.swing.JOptionPane;

public class Solução6
{
    public static void main(String[] args) 
    {
        double num;

        do 
        {
            num = Double.parseDouble(JOptionPane.showInputDialog("Digite um número (-999 para sair):"));

            if (num != -999) 
            {
                double raizQuadrada = Math.sqrt(num);
                double inverso = 1.0 / num;
                JOptionPane.showMessageDialog(null, "A raiz quadrada de " + num + " é: " + raizQuadrada);
                JOptionPane.showMessageDialog(null, "O inverso de " + num + " é: " + inverso);
            }
        } 
        while (num != -999);
    }
}