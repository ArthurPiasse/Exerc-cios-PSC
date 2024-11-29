//2) Construir um algoritmo que leia três números que representam os lados de um triângulo e que imprima se o triângulo é equilátero (três lados iguais), isósceles (dois lados iguais) ou escaleno (três lados diferentes). Antes, não se esqueça de testar se os três lados realmente formam um triângulo. Informe o usuário caso não formem.

import javax.swing.JOptionPane;

public class Solução2 
{
    public static void main(String[] args) 
    {
        int lado1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro lado:"));
        int lado2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo lado:"));
        int lado3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro lado:"));

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) 
        {
            if (lado1 == lado2 && lado2 == lado3) 
            {
                JOptionPane.showMessageDialog(null, "Triângulo equilátero.");
            } 
            else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) 
            {
                JOptionPane.showMessageDialog(null, "Triângulo isósceles.");
            } 
            else 
            {
                JOptionPane.showMessageDialog(null, "Triângulo escaleno.");
            }
        } 
            else 
            {
            JOptionPane.showMessageDialog(null, "Os lados não formam um triângulo.");
            }
    }
}