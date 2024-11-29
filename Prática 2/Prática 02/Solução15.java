//15) Entrar com o ano de nascimento de uma pessoa e o ano atual. Imprimir a idade da pessoa. Não se esqueça de verificar se o ano de nascimento é um ano válido.

import javax.swing.JOptionPane;

public class Solução15 
{
    public static void main(String[] args) 
    {
        String sAnonascimento = JOptionPane.showInputDialog("Digite o ano de nascimento:");
        int anoNascimento = Integer.parseInt(sAnonascimento);

        String sAnoatual = JOptionPane.showInputDialog("Digite o ano atual:");
        int anoAtual = Integer.parseInt(sAnoatual);


        if (anoNascimento > anoAtual) {
            JOptionPane.showMessageDialog(null, "Ano de nascimento inválido.");
        } else {
            int idade = anoAtual - anoNascimento;
            JOptionPane.showMessageDialog(null, "A idade é: " + idade);
        }
    }
}