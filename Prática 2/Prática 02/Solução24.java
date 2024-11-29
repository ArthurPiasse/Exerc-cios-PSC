//24) Ler cinco números e identificar o maior e o menor de todos (NÃO suponha números diferentes).

import javax.swing.JOptionPane;

public class Solução24 
{
    public static void main(String[] args) 
    {
        int maior = Integer.MIN_VALUE; 
        int menor = Integer.MAX_VALUE; 

        for (int i = 1; i <= 5; i++) 
        {
            String numStr = JOptionPane.showInputDialog("Digite o " + i + "º número:");
            int num = Integer.parseInt(numStr);

            if (num > maior) {
                maior = num;
            }
            if (num < menor) {
                menor = num;
            }
        }

        JOptionPane.showMessageDialog(null, "O maior número é: " + maior);
        JOptionPane.showMessageDialog(null, "O menor número é: " + menor); 

    }
}