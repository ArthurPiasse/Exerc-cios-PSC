//Crie um algoritmo que leia três palavras, separadamente, e as apresente na tela na ordem contrária em que foram digitadas, separadas por espaço

import javax.swing.JOptionPane;

public class Solução1
{
    public static void main(String[] args) 
    {
        // Leitura das palavras
        String palavra1 = JOptionPane.showInputDialog("Digite a primeira palavra:");
        String palavra2 = JOptionPane.showInputDialog("Digite a segunda palavra:");
        String palavra3 = JOptionPane.showInputDialog("Digite a terceira palavra:");


        // Inversão da ordem
        String palavrasInvertidas = palavra3 + " " + palavra2 + " " + palavra1;

        // Exibição do resultado
        JOptionPane.showMessageDialog(null, "As palavras na ordem inversa são: " + palavrasInvertidas);
    }
}