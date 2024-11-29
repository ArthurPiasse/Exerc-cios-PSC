//5) Ler três números e armazená-los em três variáveis com os seguintes nomes, de acordo com seus valores relativos: maior, intermediário e menor (suponha números diferentes).

import javax.swing.JOptionPane;

public class Solução5 
{
    public static void main(String[] args) 
    {
        // 1. Ler os três números do usuário
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número:"));


        int maior, intermediario, menor;


        if (num1 >= num2 && num1 >= num3) {
            maior = num1;
            if (num2 > num3) {
                intermediario = num2;
                menor = num3;
            } else {
                intermediario = num3;
                menor = num2;
            }
        } else if (num2 >= num1 && num2 >= num3) {
            maior = num2;
            if (num1 > num3) {
                intermediario = num1;
                menor = num3;
            } else {
                intermediario = num3;
                menor = num1;
            }
        } 
        else 
        {
            maior = num3;
            if (num1 > num2) 
            {
                intermediario = num1;
                menor = num2;
            } 
            else 
            {
                intermediario = num2;
                menor = num1;

            }
        }
        JOptionPane.showMessageDialog(null, "Os números em ordem crescente são:" + "Maior: " + maior + "\n" + "Intermediário: " + intermediario + "\n" + "Menor: " + menor);
    }
}


//Utilizei ajuda da internet nesse exercício principalmente na parteonde tive que usar o if e o else