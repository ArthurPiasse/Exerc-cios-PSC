//3) Entrar com um verbo no infinitivo e imprimir se o verbo é da 1a conjugação (terminados em ar), da 2a conjugação (terminados em er), da 3a conjugação (terminados em ir), se não está no infinitivo (não termina em r) ou se provavelmente nem é verbo no infinitivo (termina em or ou em ur).

import javax.swing.JOptionPane;

public class Solução3 
{
    public static void main(String[] args) 
    {
        String verbo = JOptionPane.showInputDialog("Digite um verbo no infinitivo:");
        String ultimaLetra = verbo.substring(verbo.length() - 1);

        if (ultimaLetra.equals("ar")) 
        {
            JOptionPane.showMessageDialog(null, "1ª conjugação.");
        } 
        else if (ultimaLetra.equals("er")) 
        {
            JOptionPane.showMessageDialog(null, "2ª conjugação.");
        } 
        else if (ultimaLetra.equals("ir")) 
        {
            JOptionPane.showMessageDialog(null, "3ª conjugação.");
        } 
        else if (ultimaLetra.equals("r")) 
        {
            JOptionPane.showMessageDialog(null, "Não está no infinitivo.");
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "Provavelmente não é um verbo no infinitivo.");
        }
    }
}