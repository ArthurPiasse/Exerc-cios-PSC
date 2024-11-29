//23) Criar um algoritmo que leia um número que servirá para controlar os números
//pares que serão impressos a partir de 2 Exemplo: quantos 4, imprime 2, 4, 6, 8.

import javax.swing.JOptionPane;

public class Solução23 
{
    public static void main(String[] args) 
    {
        // Solicita ao usuário a quantidade de números pares
        String sQuantidade = JOptionPane.showInputDialog("Digite a quantidade de números pares:");

        // Converte a entrada do usuário para um número inteiro
        int quantidade = Integer.parseInt(sQuantidade);

        // Imprime os números pares
        System.out.println("Números pares:");
        int numeroPar = 2;
        for (int i = 0; i < quantidade; i++) 
        {
            System.out.print(numeroPar + " ");
            numeroPar += 2;
        }
    }
}