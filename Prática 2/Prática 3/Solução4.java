//4) Ler vários números e informar quantos números entre 100 e 200 foram digitados. Quando o valor 0 (zero) for lido o algoritmo deverá cessar sua execução.

import javax.swing.JOptionPane;

public class Solução4 
{
    public static void main(String[] args) 
    {
        int num, contador = 0;

        do 
        {
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número (0 para sair):"));
            if (num >= 100 && num <= 200) 
            {
                contador++;
            }
        } 
        while (num != 0);

        JOptionPane.showMessageDialog(null, "Foram digitados " + contador + " números entre 100 e 200.");
    }
}