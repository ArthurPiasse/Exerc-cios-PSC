//Crie um algoritmo para calcular a área de um círculo, com base no seu raio (Área = PI * raio * raio, onde PI = 3.14159). Use variáveis reais

import javax.swing.JOptionPane;
public class Solução14
{
    public static void main(String[] args) 
    {
        //valor de PI
        final double PI = 3.14159;

        // Ler o raio
        String sraio = JOptionPane.showInputDialog("Digite o raio do círculo:");
        double raio = Double.parseDouble(sraio);

        // Calcular a área conforme o enunciado
        double area = PI * raio * raio;

        // Exibir o resultado
        JOptionPane.showMessageDialog(null, "A área do círculo é: " + area);
    }
}