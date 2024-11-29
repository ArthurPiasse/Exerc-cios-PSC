//7) Entrar com o nome, sexo e idade de uma pessoa. Se a pessoa for do sexo feminino e tiver menos que 25 anos, imprimir nome e a mensagem: ACEITA. Caso contrário, imprimir nome e a mensagem: NÃO ACEITA. (Considerar f ou F.)

import javax.swing.JOptionPane;

public class Solução7 
{
    public static void main(String[] args) 
    {
        // Entrada de dados
        String nome = JOptionPane.showInputDialog("Digite o nome:");
        var sexo = JOptionPane.showInputDialog("Digite o sexo seu sexo (M ou F):");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));

        // Condição para verificar se é aceita
        if (sexo.equalsIgnoreCase("f") && idade < 25) 
        {
            JOptionPane.showMessageDialog(null, nome + ", ACEITA.");
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, nome + ", NÃO ACEITO(a).");
        }
    }
}