import javax.swing.JOptionPane;

public class Solução26 
{
    public static void main(String[] args) 
    {
        double num1, num2, resultado;
        int opcao;

        do {
            try {
                num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
                num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));


                String menu = "Operações Disponíveis:\n" + "1. Adição\n" + "2. Subtração\n" + "3. Multiplicação\n" + "4. Divisão\n" + "9. Sair do Programa\n";

                opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

                switch (opcao) 
                {
                    case 1:
                        resultado = num1 + num2;
                        break;
                    case 2:
                        resultado = num1 - num2;
                        break;
                    case 3:
                        resultado = num1 * num2;
                        break;
                    case 4:
                        if (num2 == 0) 
                        {
                            JOptionPane.showMessageDialog(null,"Divisão por zero não é permitida.");
                        } 
                        else 
                        {
                            resultado = num1 / num2;
                        }
                        break;
                    case 9:
                        JOptionPane.showMessageDialog(null, "Saindo do programa...");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida.");
                }

                if (opcao >= 1 && opcao <= 4 && num2 != 0) 
                {
                    JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                }
            } catch (NumberFormatException e) 
            {
                JOptionPane.showMessageDialog(null,"Digite apenas números.");
            }
        } while (opcao != 9);
    }
}