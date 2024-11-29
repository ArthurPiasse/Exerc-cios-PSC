//21) Ler três números e escrever o maior número (suponha números diferentes).

import javax.swing.JOptionPane;

public class Solução21
{
    public static void main(String[] args) 
    {
        String sNum1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        int num1 = Integer.parseInt(sNum1);
        String sNum2 = JOptionPane.showInputDialog("Digite o segundo número:");
        int num2 = Integer.parseInt(sNum2);
        String sNum3 = JOptionPane.showInputDialog("Digite o terceiro número:");
        int num3 = Integer.parseInt(sNum3);

        // Encontrando o maior número
        int maior = num1; // maior com o primeiro número
        if (num2 > maior) 
        {
            maior = num2;
        }
        if (num3 > maior) 
        {
            maior = num3;
        }

        // Exibindo o resultado
        JOptionPane.showMessageDialog(null, "O maior número é: " + maior);
    }
}