//Entrar com um número e a base em que se deseja calcular o logaritmo do número, calcular tal logaritmo e imprimir o resultado

import javax.swing.JOptionPane;

public class CalculadoraLogaritmo 
{
    public static void main(String[] args) 
    {
        try 
        {
            // Solicita o número e a base ao usuário
            String numeroStr = JOptionPane.showInputDialog("Digite o número:");
            String baseStr = JOptionPane.showInputDialog("Digite a base do logaritmo:");

            double numero = Double.parseDouble(numeroStr);
            double base = Double.parseDouble(baseStr);

            // Verifica se a base é válida (maior que 0 e diferente de 1)
            //Até essa linha consegui mediante o material disponível, após ela a maioria das linhas tive que consultar a internet para 
            //tentar entender
            if (base <= 0 || base == 1) 
            {
                JOptionPane.showMessageDialog(null, "A base do logaritmo deve ser maior que 0 e diferente de 1.");
                return;
            }

            // Calcula o logaritmo usando a propriedade: log_b(a) = log(a) / log(b)
            double logaritmo = Math.log(numero) / Math.log(base);

            // Exibe o resultado
            JOptionPane.showMessageDialog(null, "O logaritmo de " + numero + " na base " + base + " é: " + logaritmo);
        } catch (NumberFormatException e) 
        {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, digite números válidos.");
        }
    }
}