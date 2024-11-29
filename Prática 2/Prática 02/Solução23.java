//23) Ler três números e armazená-los em três variáveis com os seguintes nomes, de acordo com seus valores relativos: maior, intermediário e menor (suponha números diferentes).

import javax.swing.JOptionPane;

public class Solução23
{
    public static void main(String[] args) 
    {
        String sNum1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        int num1 = Integer.parseInt(sNum1);
        String sNum2 = JOptionPane.showInputDialog("Digite o segundo número:");
        int num2 = Integer.parseInt(sNum2);
        String sNum3 = JOptionPane.showInputDialog("Digite o terceiro número:");
        int num3 = Integer.parseInt(sNum3);

        // Encontrando a ordem
        int maior, meio, menor;

        // Exibindo os resultados
        JOptionPane.showMessageDialog(null, "Ordem crescente: " + menor + ", " + meio + ", " + maior);
        JOptionPane.showMessageDialog(null, "Ordem decrescente: " + maior + ", " + meio + ", " + menor);
    }
}