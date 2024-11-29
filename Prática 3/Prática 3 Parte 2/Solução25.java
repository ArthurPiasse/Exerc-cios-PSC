import javax.swing.JOptionPane;

public class Solução25 
{
    public static void main(String[] args) 
    {
        int[] votos = new int[4]; // Array para armazenar os votos de cada candidato
        int totalVotos = 0;
        int voto = 0;

        do {
            String sVoto = JOptionPane.showInputDialog("Digite o número do seu candidato (1-4) ou -1 para encerrar:");
            try 
            {
                voto = Integer.parseInt(sVoto);
                if (voto >= 1 && voto <= 4) 
                {
                    votos[voto - 1]++; // Incrementa o voto do candidato escolhido
                    totalVotos++;
                } 
                else if (voto != -1) 
                {
                    JOptionPane.showMessageDialog(null, "Voto inválido. Digite um número entre 1 e 4 ou -1 para encerrar.");
                }
            } 
            catch (NumberFormatException e) 
            {
                JOptionPane.showMessageDialog(null, "Digite um número válido.");
            }
        } 
        while (voto != -1);

        // Calculando e exibindo os resultados
        for (int i = 0; i < votos.length; i++) 
        {
            double percentual = (double) votos[i] / totalVotos * 100;
            JOptionPane.showMessageDialog(null, "Candidato " + (i + 1) + ": " + votos[i] + " votos (" + String.format("%.2f", percentual) + "%)");
        }
        JOptionPane.showMessageDialog(null, "Total de votos: " + totalVotos);
    }
}