//3) Entrar com vários números positivos e imprimir a média dos números digitados.

import javax.swing.JOptionPane;

public class Solução3 
{
    public static void main(String[] args) 
    {
        int num, soma = 0, cont = 0;
        do 
        {
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número positivo (0 para sair):"));
            if (num > 0) 
            {
                soma += num;
                cont++;
            }
        } 
        while (num > 0);

        if (cont > 0) 
        {
            double media = (double) soma / cont;
            JOptionPane.showMessageDialog(null, "A média é: " + media);
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "Nenhum número foi digitado.");
        }
    }
}