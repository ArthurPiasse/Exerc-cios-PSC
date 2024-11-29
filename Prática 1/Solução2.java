//Crie um algoritmo que leia um número inteiro, armazene-o em uma variável do tipo int e depois escreva na tela: “O valor do número digitado é: ” e o valor do número

import javax.swing.JOptionPane;

public class Solução2
{
    public static void main(String[] args) 
    {
        //Receber o numero como texto
        String Snumero = JOptionPane.showInputDialog("Digite um número inteiro:");
        
        //Converter para um numero inteiro
        int numero = Integer.parseInt(Snumero);
        
        //Mostrar para o usuário
        JOptionPane.showMessageDialog(null, "O valor do número digitado é: " + numero);
    }
}