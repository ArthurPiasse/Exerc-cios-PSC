//Entrar com um número e imprimir o logaritmo desse número na base 10
import javax.swing.JOptionPane;

public class Solução8
{
    public static void main(String[] args) 
    {
        // ler o número
        String numeroStr = JOptionPane.showInputDialog("Digite um número positivo:");
        double numero = Double.parseDouble(numeroStr);

        // validar se o número é positivo, utilizei auxilio da internet nessa parte
        if (numero <= 0) {
            JOptionPane.showMessageDialog(null, "O número deve ser positivo.");
            return;
        }

        // calcular o logaritmo na base 10
        double logaritmo = Math.log10(numero);

        // exibir o resultado
        JOptionPane.showMessageDialog(null, "O logaritmo na base 10 de " + numero + " é: " + logaritmo);
    }
}