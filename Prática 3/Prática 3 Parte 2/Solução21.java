//21) Entrar com o nome, idade e sexo de 20 pessoas. Imprimir o nome sempre que a
//pessoa for do sexo masculino e tiver mais de 21 anos.

import javax.swing.JOptionPane;

public class Solução21 
{
    public static void main(String[] args) 
    {
        String[] nomes = new String[20];
        int[] idades = new int[20];
        char[] sexos = new char[20];

        // Coletar dados das 20 pessoas
        for (int i = 0; i < 20; i++) 
        {
            nomes[i] = JOptionPane.showInputDialog("Digite o nome da pessoa " + (i+1) + ":");
            idades[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da pessoa " + (i+1) + ":"));
            sexos[i] = JOptionPane.showInputDialog("Digite o sexo da pessoa " + (i+1) + " (M/F):").charAt(0);
        }

        // Filtrar e exibir resultados
        System.out.println("Pessoas do sexo masculino com mais de 21 anos:");
        for (int i = 0; i < 20; i++) 
        {
            if (sexos[i] == 'M' && idades[i] > 21) 
            {
                System.out.println(nomes[i]);
            }
        }
    }
}