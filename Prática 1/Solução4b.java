//Crie um algoritmo que leia três Strings por meio do JOptionPane e escreva a soma do comprimento destas Strings

import javax.swing.JOptionPane;

public class Solução4b
{
    public static void main(String[] args) 
    {
        //Inserir as Strings
        String string1 = JOptionPane.showInputDialog("Insira a Primeira palavra");
        String string2 = JOptionPane.showInputDialog("Insira a Segunda palavra");
        String string3 = JOptionPane.showInputDialog("Insira a Terceira palavra");

        //Calcular com string lenght
        int comprimentoTotal = string1.length() + string2.length() + string3.length();

        //Resultado
        JOptionPane.showMessageDialog(null, "Os caracteres totais são: " + comprimentoTotal);
    }
}