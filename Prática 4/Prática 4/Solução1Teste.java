import javax.swing.JOptionPane;

public class Solução1Teste 
{
    public static void main(String[] args) 
    {

        String nome = JOptionPane.showInputDialog("Digite o seu nome");
        String curso = JOptionPane.showInputDialog("Digite o seu curso");
        int quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos"));
        int serie = Integer.parseInt(JOptionPane.showInputDialog("Digite a serie"));
        
        Solução1 turma = new Solução1(nome, curso, quantidadeDeAlunos, serie);

        System.out.println(turma.getNome() + "\n" + turma.getCurso() + "\n" + turma.getQuantAlunos() + "\n" + turma.getSerie());
    }
}