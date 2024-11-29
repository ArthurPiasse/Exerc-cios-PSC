//5) Entrar com nomes enquanto forem diferentes de FIM e imprimir cada nome]digitado.

import javax.swing.JOptionPane;

public class Solução5 
{
    public static void main(String[] args) 
    {
        String nome;

        do 
        {
            nome = JOptionPane.showInputDialog("Digite um nome (FIM para sair):");
            if (!nome.equalsIgnoreCase("FIM")) 
            {
                JOptionPane.showMessageDialog(null, "Nome digitado: " + nome);
            }
        }
        while (!nome.equalsIgnoreCase("FIM"));
    }
}