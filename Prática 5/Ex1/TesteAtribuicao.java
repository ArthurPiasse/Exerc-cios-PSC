import javax.swing.JOptionPane;

public class TesteAtribuicao {
    public static void main(String[] args) {
        // Instancia um Professor e uma Disciplina
        Professor professor = new Professor("Dr. João", 45);
        Disciplina disciplina = new Disciplina("Matemática", true);

        // Cria uma Atribuição com o Professor e Disciplina criados
        Atribuicao atribuicao = new Atribuicao(professor, disciplina);

        // Exibe os dados da Atribuição usando JOptionPane
        JOptionPane.showMessageDialog(null, atribuicao.getDados(), "Dados da Atribuição", JOptionPane.INFORMATION_MESSAGE);
    }
}
