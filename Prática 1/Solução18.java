//Criar um algoritmo que calcule e imprime a área de um losango.

import javax.swing.JOptionPane;

public class Solução18 
{
    public static void main(String[] args) 
    {
        //Pedir as partes do losango (tive auxilio da internet para lembrar como calcula)
        String sdiagonal = JOptionPane.showInputDialog("Digite a medida da diagonal maior do losango:");
        String sdiagonal2 = JOptionPane.showInputDialog("Digite a medida da diagonal menor do losango:");

        // Converte as strings para números double
        double diagonalMaior = Double.parseDouble(sdiagonal);
        double diagonalMenor = Double.parseDouble(sdiagonal2);

        // Calcula a área
        double area = (diagonalMaior * diagonalMenor) / 2;

        // Mostra o resultado
        JOptionPane.showMessageDialog(null, "A área do losango é: " + area);
    }
}