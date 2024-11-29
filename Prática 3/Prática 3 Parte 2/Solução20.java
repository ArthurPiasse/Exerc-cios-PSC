//20) Criar um algoritmo que leia um número que será o limite superior de um intervalo
//e o incremento. Imprimir todos os números do intervalo de 0 até esse número, de
//incremento em incremento. Ex: limite 20, incremento 5; vai imprimir 0, 5, 10, 15, 20.

import javax.swing.JOptionPane;

public class Solução20 
{
    public static void main(String[] args) 
    {
        // Obter os dados do usuário
        String slimiteSuperior = JOptionPane.showInputDialog("Digite o limite superior:");
        String sincremento = JOptionPane.showInputDialog("Digite o incremento:");

        // Converter as strings para números
        int limiteSuperior = Integer.parseInt(slimiteSuperior);
        int incremento = Integer.parseInt(sincremento);

        // Construir a string com os números do intervalo
        String resultado = "Números do intervalo:\n";
        for (int i = 0; i <= limiteSuperior; i += incremento) 
        {
            resultado += i + " ";
        }

        // Exibir o resultado
        JOptionPane.showMessageDialog(null, resultado);
    }
}