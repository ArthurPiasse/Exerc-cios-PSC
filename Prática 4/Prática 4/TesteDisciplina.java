import javax.swing.JOptionPane;

public class TesteDisciplina 
{
    public static void main(String[] args) 
    {
        String nome = JOptionPane.showInputDialog("Digite o nome da disciplina:");
        String professor = JOptionPane.showInputDialog("Digite o nome do professor:");

        String semestreString = JOptionPane.showInputDialog("Digite o semestre:");
        String ofertadaString = JOptionPane.showInputDialog("A disciplina será ofertada? (sim/não)");

        int semestre = Integer.parseInt(semestreString);
        boolean ofertada = ofertadaString.equalsIgnoreCase("sim");

        Disciplina disciplina = new Disciplina(nome, professor, semestre, ofertada);

        disciplina.exibirInformacoes();
    }
}