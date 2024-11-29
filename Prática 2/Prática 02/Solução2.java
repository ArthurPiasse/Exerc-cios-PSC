//2) Construir um algoritmo que leia dois números e efetue a adição. Caso o valor somado seja menor ou igual a 20, este deverá ser apresentado subtraindo-se 5.

import javax.swing.JOptionPane;

public class SomaMenorIgual
{
    public static void main(String[] args)
    {
        //Ler os números
        String sNumero1 = JOptionPane.showInputDialog("Insira um numero:");
        String sNumero2 = JOptionPane.showInputDialog("Insira um segundo numero:");

        //Transformar em numero e somar
        double numero1 = Double.parseDouble(sNumero1);
        double numero2 = Double.parseDouble(sNumero2);
        double soma = numero1 + numero2;

        //Resultado
        if (soma <= 20)
        {
            double resultado = soma -5;
            JOptionPane.showMessageDialog(null, "O resultado da soma -5 é: " + resultado);
        }
    }
}