//Entrar com um número inteiro de 3 casas decimais e imprimir o algarismo da casa das dezenas

import javax.swing.JOptionPane;

public class Solução6b
{
    public static void main(String[] args)
    {
        // Ler o número inteiro como uma string
        String snumero = JOptionPane.showInputDialog("Digite um número inteiro de até 3 dígitos:");

        // Converter a string para um número inteiro
        int numero = Integer.parseInt(snumero);

        // Isolar o algarismo das dezenas usando divisão inteira e o operador módulo
        int algarismoDezenas = (numero / 10) % 10;

        // Exibir o resultado
        JOptionPane.showMessageDialog(null, "O algarismo das dezenas é: " + algarismoDezenas);
    }
}
