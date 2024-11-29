//8) Imprimir na tela o produto de todos os números de 120 a 300.

public class Solução8 
{
    public static void main(String[] args) 
    {
        long produto = 1; // Iniciamos o produto em 1 para não afetar a multiplicação

        for (int i = 120; i <= 300; i++) 
        {
            produto *= i;
        }

        System.out.println("O produto dos números de 120 a 300 é: " + produto);
    }
}