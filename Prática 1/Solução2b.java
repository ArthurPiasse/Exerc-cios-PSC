//Crie um algoritmo para calcular a área de um retângulo, com base nas medidas de sua base e de sua altura;

import javax.swing.JOptionPane;
public class Calculadoratriangulo
{
public static void main(String[] args)
{
    //Lendo os dados/Obter a base e altura do triangulo
    String sBase = JOptionPane.showInputDialog("Insira a Base");
    double base = Double.parseDouble(sBase);
    
    String sAltura = JOptionPane.showInputDialog("insira a Altura");
    double altura = Double.parseDouble(sAltura);

    //Calculo
    double area = base*altura;

    //Resultado
    JOptionPane.showMessageDialog(null, "A área do retângulo é:" + area);
}
}