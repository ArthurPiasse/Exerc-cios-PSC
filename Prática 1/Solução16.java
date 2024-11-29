//Entrar com um número e imprimir o número, seu quadrado e sua raiz quadrada

import javax.swing.JOptionPane;

public class Solução16
{
    public static void main(String[] args)
    {
        String snumero = JOptionPane.showInputDialog("Insira um número qualquer: ");
        double numero = Double.parseDouble(snumero);

        // Calcula o quadrado e a raiz quadrada
        double quadrado = Math.pow(numero, 2);
        double raizquadrada = Math.sqrt(numero);

        // Mostra o resultado
        JOptionPane.showMessageDialog(null, "Número: " + numero + "\n" + "Quadrado: " + quadrado + "\n" + "Raiz quadrada: " + raizquadrada);
    }
}