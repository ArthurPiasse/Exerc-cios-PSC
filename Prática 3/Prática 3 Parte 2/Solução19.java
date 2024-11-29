//19) Crie um algoritmo que calcule o fatorial de um número. Exemplo: 0! = 1; 1! = 1; 2!
//= 1*2 = 2; 3! = 1*2*3 = 6; 4! = 1*2*3*4 = 24; 5! = 1*2*3*4*5 = 120; ...

import javax.swing.JOptionPane;

public class Solução19
{
    public static void main(String[] args)
    {
        String numeroStr = JOptionPane.showInputDialog("Digite um número para calcular o fatorial:");
        int numero = Integer.parseInt(numeroStr);

        // Calcular o fatorial
        long fatorial = 1;
        for (int i = 1; i <= numero; i++) 
        {
            fatorial *= i;
        }

        // Exibir o resultado
        JOptionPane.showMessageDialog(null, "O fatorial de " + numero + " é: " + fatorial);
    }
}