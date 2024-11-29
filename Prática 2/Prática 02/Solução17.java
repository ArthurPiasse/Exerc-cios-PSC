//17) Entrar com dois números e imprimir o menor número (suponha números diferentes)

import javax.swing.JOptionPane;

public class Solução17 
{
    public static void main(String[] args) 
    {
        String sNumero1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        String sNumero2 = JOptionPane.showInputDialog("Digite o segundo número:");
        int numero1 = Integer.parseInt(sNumero1);
        int numero2 = Integer.parseInt(sNumero2);

        // Encontrando o menor número
        if (numero1 < numero2) {
            JOptionPane.showMessageDialog(null, "O menor número é: " + numero1);
        } else {
            JOptionPane.showMessageDialog(null, "O menor número é: " + numero2);
        }
    }
}