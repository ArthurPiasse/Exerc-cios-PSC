//Crie um algoritmo que leia um número inteiro e o eleve ao quadrado usando o método double Math.pow(base, expoente), onde base e expoente são números reais;

import javax.swing.JOptionPane;
public class Solução3b
{
    public static void main(String[] args) 
    {
        //Inserir o número e transformar em número
        String sNumero =JOptionPane.showInputDialog("Digite um número");
        double numero = Double.parseDouble(sNumero);

        //Calcular e elevar ao quadrado
        double quadrado = Math.pow(numero,2);

        //Resultado
        JOptionPane.showMessageDialog(null, "O quadrado de:" + quadrado);
    }
}