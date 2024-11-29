//18) Faça um algoritmo para imprimir na tela uma tabela de conversão de graus Celsius
//para graus Fahrenheit. Deseja-se que o mesmo solicite ao usuário o limite inferior, o
//superior e o incremento. Lembre-se que C = 5.(F-32)/9

import javax.swing.JOptionPane;
public class Solução18
{
    public static void main(String[] args) 
    {
        // Obter os dados do usuário
        String slimiteInferior = JOptionPane.showInputDialog("Digite o limite inferior em Fahrenheit:");
        String slimiteSuperior = JOptionPane.showInputDialog("Digite o limite superior em Fahrenheit:");
        String sIncremento = JOptionPane.showInputDialog("Digite o incremento:");

        // Converter as strings para números
        int limiteInferior = Integer.parseInt(slimiteInferior);
        int limiteSuperior = Integer.parseInt(slimiteSuperior);
        int incremento = Integer.parseInt(sIncremento);

        // Construir a tabela
        String tabela = "Tabela de Conversão de Fahrenheit para Celsius\n";
        tabela += String.format("%-10s %-10s\n", "Fahrenheit", "Celsius");

        for (int fahrenheit = limiteInferior; fahrenheit <= limiteSuperior; fahrenheit += incremento) 
        {
            double celsius = 5.0 * (fahrenheit - 32) / 9;
            tabela += String.format("%-10d %-10.2f\n", fahrenheit, celsius);
        }

        // Exibir a tabela
        JOptionPane.showMessageDialog(null, tabela);
    }
}