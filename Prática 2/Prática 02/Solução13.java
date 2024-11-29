//13) Ler um número inteiro de 3 casas decimais e imprimir se o algarismo da casa das dezenas é par ou ímpar

import javax.swing.JOptionPane;

public class Solução13 
{
    public static void main(String[] args) 
    {
        // Entrada de dados
        String sNumero = JOptionPane.showInputDialog("Digite um número de 3 dígitos:");
        int numero = Integer.parseInt(sNumero);

        // Isolar o algarismo das dezenas
        int dezena = (numero / 10) % 10;

        // Verificar se a dezena é par ou ímpar
        if (dezena % 2 == 0) 
        {
            JOptionPane.showMessageDialog(null, "O algarismo das dezenas é par.");
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "O algarismo das dezenas é ímpar.");
        }
    }
}