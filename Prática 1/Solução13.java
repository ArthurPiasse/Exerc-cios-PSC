//Escrever um algoritmo que leia três números reais (a, b e c), calcule e escreva o resultado da expressão x = 2 * ( ( a – c ) / 8 ) – b * 5

import javax.swing.JOptionPane;
public class Solução13
{
    public static void main(String[] args)
    {
        //Receber os números
        String numero1 = JOptionPane.showInputDialog("Insira o primeiro número: ");
        double a = Double.parseDouble(numero1);

        String numero2 = JOptionPane.showInputDialog("Insira o segundo número: ");
        double b = Double.parseDouble(numero2);

        String numero3 = JOptionPane.showInputDialog("Insira o terceiro número");
        double c = Double.parseDouble(numero3);

        //Calcular a expressão
        double x = 2 * (( a - c ) / 8) - b * 5;

        //Mostrar o resultado
        JOptionPane.showMessageDialog(null, "O Resultado de x é: " + x);
    }
}