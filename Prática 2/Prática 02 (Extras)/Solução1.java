//1) Construir um algoritmo que leia três números e imprima se eles podem ou não ser lados de um triângulo. Lembrando que, para ser um triângulo, a soma de dois lados quaisquer deve ser sempre maior que o lado que ficou de fora da soma.

import javax.swing.JOptionPane;

public class Solução1 
{
    public static void main(String[] args) 
    {
        int lado1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro lado:"));
        int lado2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo lado:"));
        int lado3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro lado:"));

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) 
        {
            JOptionPane.showMessageDialog(null, "Os lados formam um triângulo.");
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "Os lados não formam um triângulo.");
        }
    }
}