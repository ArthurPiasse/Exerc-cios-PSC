//Crie um algoritmo para calcular a área de um retângulo, com base nas medidas de sua base e de sua altura;

import javax.swing.JOptionPane;
public class Solução1b
{
public static void main(String[] args)
{
    //Lendo os Dados
    String sIdade = JOptionPane.showInputDialog("Digite sua Idade");
     //Calculo 
    double Idade = Double.parseDouble(sIdade);
    //Resultado
    JOptionPane.showMessageDialog(null, "Você viveu aproximadamente:" + Idade*365);
}
}
