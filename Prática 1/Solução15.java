//Ler dois números inteiros e imprimir dividendo, divisor, quociente e resto

import javax.swing.JOptionPane;
public class Solução15
{
    public static void main (String[] args);
    {
        String numero1 = JOptionPane.showInputDialog("Insira o dividendo: ");
        int dividendo = Interger.parseInt(numero1);

        String numero2 = JOptionPane.showInputDialog("Insira o divisor: ");
        int divisor = Interger.parseInt(numero2);

        //Calcular
        int quociente = dividendo / divisor;
        int resto = dividendo % divisor;

        //Mostrar o resultado
        JOptionPane.showMessageDialog(null, "Dividendo: " + dividendo + "\n" +"Divisor: " + divisor + "\n" + "Quociente: " + quociente + "\n" + "Resto: " + resto);
    }
}

//Ainda não entendi o que falta para o programa rodar, mas acredito que seja no int que não converte a String