import javax.swing.JOptionPane;

public class Solução22 
{
    public static void main(String[] args) 
    {
        // Solicita ao usuário o limite superior
        String limiteSuperiorStr = JOptionPane.showInputDialog("Digite o limite superior:");

        // Converte a entrada do usuário para um número inteiro
        int limiteSuperior = Integer.parseInt(limiteSuperiorStr);

        // Imprime os números ímpares
        System.out.println("Números ímpares menores que " + limiteSuperior + ":");
        for (int i = 1; i < limiteSuperior; i += 2) 
        {
            System.out.print(i + " ");
        }
    }
}