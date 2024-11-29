//10) Ler vários números até entrar o número -999. Para cada número, imprimir seus divisores.

import javax.swing.JOptionPane;

public class Solução10 
{
    public static void main(String[] args) 
    {
        int numero;
        String divisores;

        do 
        {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número (-999 para sair):"));

            if (numero != -999) 
            {
                divisores = "";
                for (int i = 1; i <= numero; i++) 
                {
                    if (numero % i == 0) 
                    {
                        divisores += i + " ";
                    }
                }
                JOptionPane.showMessageDialog(null, "Os divisores de " + numero + " são: " + divisores);
            }
        } while (numero != -999);
    }
}