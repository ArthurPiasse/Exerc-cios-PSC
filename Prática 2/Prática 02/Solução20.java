//20) Criar um algoritmo que deixe entrar com dois números e imprimir o quadrado do menor número e a raiz quadrada do maior número, se for possível (suponha números diferentes).

import javax.swing.JOptionPane;

public class Solução20 
{
    public static void main(String[] args) 
    {

        String sNumero1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        String sNumero2 = JOptionPane.showInputDialog("Digite o segundo número:");
        int numero1 = Integer.parseInt(sNumero1);
        int numero2 = Integer.parseInt(sNumero2);

        // Encontrando o menor e o maior
        int menor, maior;
        if (numero1 < numero2) 
        {
            menor = numero1;
            maior = numero2;
        } 
        else 
        {
            menor = numero2;
            maior = numero1;
        }

        // Calculando
        int quadradoMenor = menor * menor;
        double raizQuadradaMaior = Math.sqrt(maior);

        JOptionPane.showMessageDialog(null, "O quadrado do menor número é: " + quadradoMenor);
        JOptionPane.showMessageDialog(null, "A raiz quadrada do maior número é: " + raizQuadradaMaior);
    }
}