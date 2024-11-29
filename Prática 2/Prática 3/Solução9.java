
import javax.swing.JOptionPane;

//9) Imprimir na tela todos os números de 1 a 100 e a soma deles.

public class Solução9 
{
    public static void main(String[] args) 
    {
       int soma = 0;
        String resultado = "";

        for (int i = 1; i <= 100; i++) 
        {
            soma += i;
            resultado += i + ", ";
        }

        // Remove a última vírgula e espaço do resultado
        resultado = resultado.substring(0, resultado.length() - 2);

        JOptionPane.showMessageDialog(null, "Números de 1 a 100: " + resultado + "\nSoma: " + soma);
    }
}