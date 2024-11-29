//Enunciados: 1) Construir um algoritmo que leia dois valores numéricos inteiros e efetue a adição; caso o resultado seja maior que 10, apresentá-lo.

import javax.swing.JOptionPane;

public class AdicaoNumeros
{
    public static void main(String[] args) 
    {
        //ler os valores
        String sNumero1 = JOptionPane.showInputDialog("Insira um número inteiro: ");
        String sNumero2 = JOptionPane.showInputDialog("Insira um outro número inteiro: ");

        //transformar em número
        int numero1 = Integer.parseInt(sNumero1);
        int numero2 = Integer.parseInt(sNumero2);

        //Calcular e mostrar o resultado
        int resultado = numero1 + numero2;
        if (resultado > 10)
        {
            JOptionPane.showMessageDialog(null, "O Resultado é: " + resultado + " que maior que 10.");
        }
    } 
}