//Criar um algoritmo que calcule e imprime a área de um triângulo

import javax.swing.JOptionPane;
public class Solução17
{
    public static void main (String[] args)
    {
        //Inserir e transformar em número
        String base1 = JOptionPane.showInputDialog("Digite a base do triângulo:");
        double base = Double.parseDouble(base1);

        String altura1 = JOptionPane.showInputDialog("Digite a altura do triângulo:");
        double altura = Double.parseDouble(altura1);

        // Calcula a área
        double area = (base * altura) / 2;

        // Mostra o resultado
        JOptionPane.showMessageDialog(null, "A área do triângulo é: " + area);
    }
}