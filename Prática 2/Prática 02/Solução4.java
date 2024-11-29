//4) Ler três números e escrevê-los em ordem crescente (suponha números diferentes)

import javax.swing.JOptionPane;

public class OrdemCrescente
{
    public static void main(String[] args)
    {
        //Ler os 3 numeros
        String sNumero1 = JOptionPane.showInputDialog("Insira um número: ");
        String sNumero2 = JOptionPane.showInputDialog("Insira o segundo número: ");
        String sNumero3 = JOptionPane.showInputDialog("Insira o terceiro número");

        int num1 = Integer.parseInt(sNumero1);
        int num2 = Integer.parseInt(sNumero2);
        int num3 = Integer.parseInt(sNumero3);

        //Organizar em ordem crescente (lógica)
         if (num1 < num2 && num1 < num3) {
            if (num2 < num3) {
                JOptionPane.showMessageDialog(null, "Ordem crescente: " + num1 + ", " + num2 + ", " + num3);
            } else {
                JOptionPane.showMessageDialog(null, "Ordem crescente: " + num1 + ", " + num3 + ", " + num2);
            }
        } else if (num2 < num1 && num2 < num3) {
            if (num1 < num3) {
                JOptionPane.showMessageDialog(null, "Ordem crescente: " + num2 + ", " + num1 + ", " + num3);
            } else {
                JOptionPane.showMessageDialog(null, "Ordem crescente: " + num2 + ", " + num3 + ", " + num1);
            }
        } else {
            if (num1 < num2) {
                JOptionPane.showMessageDialog(null, "Ordem crescente: " + num3 + ", " + num1 + ", " + num2);
            } else {
                JOptionPane.showMessageDialog(null, "Ordem crescente: " + num3 + ", " + num2 + ", " + num1);
            }
        }
    }
}
