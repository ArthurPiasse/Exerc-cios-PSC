import javax.swing.JOptionPane;

public class Solução16 
{
    public static void main(String[] args) 
    {
        String sNum = JOptionPane.showInputDialog("Insira quantas vezes será feito a sequência de Fibonacci: ");
        int n = Integer.parseInt(sNum);
        int primeiro = 0, segundo = 1, proximo;

        while (n >= 0) 
        {
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
            n--;
        }
        JOptionPane.showMessageDialog(null, primeiro + " ");

    }
}