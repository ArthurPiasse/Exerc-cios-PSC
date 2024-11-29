//22) Ler três números e armazenar o maior número na variável de nome maior (suponha números diferentes).

import javax.swing.JOptionPane;

public class Solução22 
{
    public static void main(String[] args) 
    {
        String sNum1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        int num1 = Integer.parseInt(sNum1);
        String sNum2 = JOptionPane.showInputDialog("Digite o segundo número:");
        int num2 = Integer.parseInt(sNum2);
        String sNum3 = JOptionPane.showInputDialog("Digite o terceiro número:");
        int num3 = Integer.parseInt(sNum3);

        int maiorNumero = num1; // Inicializa com o primeiro número
        if (num2 > maiorNumero) 
        {
            maiorNumero = num2;
        }
        if (num3 > maiorNumero) 
        {
            maiorNumero = num3;
        }

        JOptionPane.showMessageDialog(null, "O maior número é: " + maiorNumero);
    }
}