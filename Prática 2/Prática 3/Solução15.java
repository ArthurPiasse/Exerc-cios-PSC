//15) Entrar com vários números e imprimir o maior. O algoritmo para quando se digita -9999.

import javax.swing.JOptionPane;

public class Solução15 
{
    public static void main(String[] args) 
    {
        int numero, maior = Integer.MIN_VALUE;

        do 
        {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número (-9999 para parar):"));

            if (numero > maior && numero != -9999) 
            {
                maior = numero;
            }
        } 
        while (numero != -9999);

        JOptionPane.showMessageDialog(null, "O maior número digitado foi: " + maior);
    }
}