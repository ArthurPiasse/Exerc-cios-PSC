//6) Entrar com um número e imprimir uma das mensagens: maior do que 20, igual a 20 ou menor do que 20.

import javax.swing.JOptionPane;

public class Solução6
{
    public static void main(String[] args) 
    {
        //Entrar com um número e transformar em numero
        String sN1 = JOptionPane.showInputDialog("Insira um número qualquer: ");
        int n1 = Integer.parseInt(sN1);

// Verificar e mostrar em qual parte ele se encaixa
        if (n1 > 20) 
        {
            JOptionPane.showMessageDialog(null, "O número: " + n1 + " é maior que 20");
        } 
        else if (n1 == 20) 
        {
            JOptionPane.showMessageDialog(null, "O número: " + n1 + " é igual a 20");
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "O número: " + n1 + " é menor que 20");
        }
    }
}