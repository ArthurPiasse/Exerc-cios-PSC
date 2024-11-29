//Ler dez caracteres e imprimir a palavra formada por eles

import javax.swing.JOptionPane;

public class Solução5
{
     public static void main(String[] args)
     {
        String palavra = "";

        for (int i = 0; i < 10; i++) 
        {
            String caractere = JOptionPane.showInputDialog("Digite o caractere " + (i+1) + ":");
            palavra += caractere;
        }

        JOptionPane.showMessageDialog(null, "A palavra formada é: " + palavra);
    }
}

//Para esse exercício precisei de auxilio da internet para entender como repetir os caracteres, vi que usando while era possível colocar em loop até 10 caracteres
