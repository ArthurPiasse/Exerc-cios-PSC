//3) Entrar com um número e imprimir a raiz quadrada do número caso ele seja positivo e o quadrado do número caso seja negativo.

import javax.swing.JOptionPane;

public class RaizQuadradaAoQuadrado
{
    public static void main(String[] args) 
    {
        //Ler os numeros
        String sNumero = JOptionPane.showInputDialog("Insira um número: ");
        double numero = Double.parseDouble(sNumero);

        //Realizar o calculo e mostrar o resultado
        if (numero > 0)
        {
            //Calcular a raiz
            double raizQuadrada = Math.sqrt(numero);
            JOptionPane.showMessageDialog(null, "A raiz quadrada de " + numero + "é: " + raizQuadrada);
        }
            else 
            {
                //calcular o quadrado
                double quadrado = Math.pow (numero, 2);
                JOptionPane.showMessageDialog(null, "O quadrado do " + numero + "é: " + quadrado);
            }
    }
}