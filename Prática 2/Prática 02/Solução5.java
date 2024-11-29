//5) Construir um algoritmo que indique se o número digitado está compreendido entre 20 e 90 ou não.

import javax.swing.JOptionPane;

public class EntreVinteNoventa
{
    public static void main (String[] args)
    {
        //Ler o número e transformar em numero
        String sNumero = JOptionPane.showInputDialog("Digite um número qualquer: ");
        double n1 = Double.parseDouble(sNumero);

        //Verificar se está entre 20 e 90
        if (n1 >= 20 && n1 <= 90)
        {
            JOptionPane.showMessageDialog(null, "O número informado: " + n1 + " esta entre 20 e 90");
        }
            else
            {
                JOptionPane.showMessageDialog(null, "O número informado: " + n1 + "não está entre 20 e 90");
            }
    }
}
