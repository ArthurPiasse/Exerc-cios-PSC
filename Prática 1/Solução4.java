//Solicite ao usuário que digite seu peso no formato real. Depois imprima “O peso informado foi “ + peso + “ kg.”

import javax.swing.JOptionPane;

public class PesoKG 
{
    public static void main(String[] args) 
    {
        //Receber o peso e transformar em número
        String Speso = JOptionPane.showInputDialog("Digite seu peso: ");
        double peso = Double.parseDouble(Speso);

        //Resultado
        JOptionPane.showMessageDialog(null,"O peso informado foi: " + peso + "kg");
    }
}