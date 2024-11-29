//8) Entrar com dois números e imprimir o maior número (suponha números diferentes).

import javax.swing.JOptionPane;

public class Solução8 
{
    public static void main(String[] args) 
    {
        // Receber os números
        String sNumero1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        String sNumero2 = JOptionPane.showInputDialog("Digite o segundo número:");
        int numero1 = Integer.parseInt(sNumero1);
        int numero2 = Integer.parseInt(sNumero2);

        // Comparando os números e exibindo o maior
        if (numero1 > numero2) 
        {
            JOptionPane.showMessageDialog(null, "O maior número é: " + numero1);
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "O maior número é: " + numero2);
        }
    }
}