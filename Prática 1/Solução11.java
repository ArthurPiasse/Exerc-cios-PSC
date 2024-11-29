//Entre com uma data em uma variável do tipo inteiro no formato ddmmaa e imprimir dia, mês e ano separados

import javax.swing.JOptionPane;

public class Solução11 
{
    public static void main(String[] args) 
    {
        //ler a data no formato ddmmaa (tive que pesquisar na internet o que seria isso)
        String sdata = JOptionPane.showInputDialog("Digite a data no formato DDMMAA (ex: 25042023):");
        int data = Integer.parseInt(sdata);

        // Separando os dígitos (tive que pesquisar como realizar os calculos na internet para separar os decimais certos)
        int dia = data / 1000000;
        int mes = (data / 100) % 100; //essa parte acaba pegando os 4 digitos do meio 
        int ano = data % 100;

        // Exibindo os resultados
        JOptionPane.showMessageDialog(null, "Dia: " + dia + "\nMês: " + mes + "\nAno: " + ano);
    }
}