//Crie um algoritmo que calcule o valor de uma dívida, submetida a juros compostos: Valor_Final = Valor_Inicial * (1 + J/100)^N, onde J representa os juros (em %) e N representa o número de meses. Responda: se você deve para o cartão de crédito R$ 100,00, à taxa de juros de 10%, quanto deverá depois de 8 meses?

import javax.swing.JOptionPane;

public class Solução5b
{
    public static void main(String[] args) 
    { 
        String svalorinicial = JOptionPane.showInputDialog("Insira o Valor da dívida (R$):");
        double valorInicial = Double.parseDouble(svalorinicial);

        String staxajuros = JOptionPane.showInputDialog("Insira a taxa de juros anual");
        double taxajuros = Double.parseDouble(staxajuros);

        String smeses = JOptionPane.showInputDialog("Insira o número de meses");
        int meses = Integer.parseInt(smeses);

        double taxajurosMensal = taxajuros/12/100;

        double valorfinal = valorInicial * Math.pow (1 + taxajurosMensal, meses);

        JOptionPane.showMessageDialog(null, "O valor da dívida depois de" + meses + "meses será de R$ " + valorfinal);
    }

}

//Não entendi muito o conceito da questão, principalmente a pergunta final "se você deve para o cartão de crédito R$ 100,00, à taxa de juros de 10%, quanto deverá depois de 8 meses?"
// Mas a resposta seria de R$ 106,86 de acordo com o programa feito
//Tive que consultar na internet para poder utilizar a ferramenta Math