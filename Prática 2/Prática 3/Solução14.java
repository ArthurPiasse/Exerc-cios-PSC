//14) Escrever um algoritmo que receba vários números inteiros positivos e imprima a quantidade de números primos dentre os números que foram digitados. Parar quando for digitado um número não positivo.

import javax.swing.JOptionPane;

public class Solução14 
{
    public static void main(String[] args) 
    {
        int numero, contadorPrimos = 0;

        do 
        {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro positivo (ou negativo para parar):"));

            if (numero > 1) 
            {
                if (ehPrimo(numero)) 
                {
                    contadorPrimos++;
                }
            }
        } 
        while (numero > 0);

        JOptionPane.showMessageDialog(null, "A quantidade de números primos digitados é: " + contadorPrimos);
    }

    public static boolean ehPrimo(int num) 
    {
        if (num <= 1) 
        {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) 
        {
            if (num % i == 0) 
            {
                return false;
            }
        }
        return true;
    }
}