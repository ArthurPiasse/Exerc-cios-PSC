//4) Ajude uma escola a montar as divisões do laboratório de programação. Para isso,
//escreva um algoritmo que leia o nome do aluno e diga em qual divisão ele está
//respeitando a regra abaixo:
//- Alunos cujo nome começa com as letras de A a K estão na D1;
//- Alunos cujo nome começa com as letras de L a N estão na D2;
//- Alunos cujo nome começa com as letras de O a Z estão na D3.
//Dica: use o método charAt(posição)

import javax.swing.JOptionPane;

public class Solução4 
{
    public static void main(String[] args) 
    {
        String nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
        char primeiraLetra = nome.charAt(0);

        if (primeiraLetra >= 'A' && primeiraLetra <= 'K') 
        {
            JOptionPane.showMessageDialog(null, "O aluno " + nome + " está na D1.");
        } 
        else if (primeiraLetra >= 'L' && primeiraLetra <= 'N') 
        {
            JOptionPane.showMessageDialog(null, "O aluno " + nome + " está na D2.");
        } 
        else if (primeiraLetra >= 'O' && primeiraLetra <= 'Z') 
        {
            JOptionPane.showMessageDialog(null, "O aluno " + nome + " está na D3.");
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "Nome inválido.");
        }
    }
}