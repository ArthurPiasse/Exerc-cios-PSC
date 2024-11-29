//Leia 4 números inteiros, representando milhar, centena, dezena e unidade. Use o tipo caractere para garantir que não seja digitado mais de um número por vez. Depois concatene estes caracteres armazenando-os em uma String (lembre-se de que o jeito mais fácil de transformar algo em String é concatenando-o com uma String vazia “”). Imprima o resultado

import javax.swing.JOptionPane;

public class Solução6
 {
    public static void main(String[] args) 
    {
    
        String smilhar = JOptionPane.showInputDialog("Digite o milhar:");
        String scentena = JOptionPane.showInputDialog("Digite a centena:");
        String sdezena = JOptionPane.showInputDialog("Digite a dezena:");
        String sunidade = JOptionPane.showInputDialog("Digite a unidade:");

        // Concatenando os dígitos em uma string
        String numero = smilhar + scentena + sdezena + sunidade;

        // Imprimindo o número
        JOptionPane.showMessageDialog(null, "O número formado é: " + numero);
    }
}