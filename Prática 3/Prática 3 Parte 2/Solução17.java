//17) Faça um algoritmo para imprimir na tela uma tabela de conversão de polegadas
//para centímetros. Deseja-se que a tabela conste de valores desde 1 até 20 polegadas.
//Lembre-se que 1 polegada equivale a 2,54 cm.

import javax.swing.JOptionPane;
public class Solução17
{
    public static void main(String[] args)
    {
        String tabela = "Tabela de Conversão de Polegadas para Centímetros\n";
        tabela += "------------------------------------------------\n";

        for (int polegadas = 1; polegadas <= 20; polegadas++) 
        {
            double centimetros = polegadas * 2.54;
            tabela += polegadas + " polegada(s) = " + centimetros + " cm\n";
        }

        JOptionPane.showMessageDialog(null, tabela);
    }
}