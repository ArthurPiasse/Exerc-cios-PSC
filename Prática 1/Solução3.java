//Crie um algoritmo que leia 3 números que representem uma data, respectivamente dia, mês e ano. Depois imprima a data usando o formato dia/mês/ano

import javax.swing.JOptionPane;

public class Solução4 
{
    public static void main(String[] args) 
    {
        // Receber o dia o mes e o ano em texto
        String Sdia = JOptionPane.showInputDialog("Digite o dia:");
        String Smes = JOptionPane.showInputDialog("Digite o mês:");
        String Sano = JOptionPane.showInputDialog("Digite o ano:");

        // Converte as strings para números inteiros
        int dia = Integer.parseInt(Sdia);
        int mes = Integer.parseInt(Smes);
        int ano = Integer.parseInt(Sano);

        // Formata conforme pedido pelo enunciado
        String dataFormatada = dia + "/" + mes + "/" + ano;

        // Mostra a data formatada
        JOptionPane.showMessageDialog(null, "A data é: " + dataFormatada);
    }
}