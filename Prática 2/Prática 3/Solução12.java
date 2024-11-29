//12) Entrar com a idade de várias pessoas e imprimir: total de pessoas com menos de 21 anos e total de pessoas com mais de 50 anos. Parar quando for digitada uma idade fora da faixa 0-120 anos.

import javax.swing.JOptionPane;

public class Solução12 
{
    public static void main(String[] args) 
    {
        int idade, menores21 = 0, maiores50 = 0;

        do {
            idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade (0-120):"));

            if (idade >= 0 && idade <= 120) 
            {
                if (idade < 21) 
                {
                    menores21++;
                } 
                else if (idade > 50) 
                {
                    maiores50++;
                }
            } 
            else 
            {
                break;
            }
        } while (true);

        JOptionPane.showMessageDialog(null, "Total de pessoas com menos de 21 anos: " + menores21 + "\n" +
                                            "Total de pessoas com mais de 50 anos: " + maiores50);
    }
}