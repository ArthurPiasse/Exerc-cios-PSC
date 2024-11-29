//Crie um algoritmo que embaralhe mensagens fazendo o seguinte: leia três frases, separe cada uma delas ao meio. Então junte nesta ordem: primeira metade da segunda, segunda metade da terceira, segunda metade da segunda, primeira metade da primeira, primeira metade da terceira, segunda metade da primeira. Concatene então as três frases originais e imprima o resultado. Na linha de baixo, escreva a frase embaralhada e compare o resultado

import javax.swing.JOptionPane;

public class Solução10 
{
    public static void main(String[] args) 
    {
        //receber as frases
        String frase1 = JOptionPane.showInputDialog("Digite a primeira frase:");
        String frase2 = JOptionPane.showInputDialog("Digite a segunda frase:");
        String frase3 = JOptionPane.showInputDialog("Digite a terceira frase:");

        //dividindo as frases ao meio
        int meio1 = frase1.length() / 2;
        int meio2 = frase2.length() / 2;
        int meio3 = frase3.length() / 2;
        //Até então consegui fazer normalmente seguindo a lógica explicada em sala, mas as linhas abaixo eu não consegui sozinho
        //Tive que consultar na internet mas mesmo assim não compreendi como foi feito a concatenação

        String fraseEmbaralhada = 
                frase2.substring(meio2) + 
                frase3.substring(meio3) + 
                frase2.substring(0, meio2) + 
                frase1.substring(0, meio1) + 
                frase3.substring(0, meio3) + 
                frase1.substring(meio1);

        // Impressão do resultado
        JOptionPane.showMessageDialog(null, "Frases originais:\n" + frase1 + "\n" + frase2 + "\n" + frase3 + 
                                          "\nFrase embaralhada:\n" + fraseEmbaralhada);
     }
}