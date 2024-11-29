// Entrar com um ângulo em graus e imprimir: seno, cosseno, tangente, secante, cossecante e cotangente
//Esse exercício é um tanto quanto complexo e provavelmente vou precisar utilizar o google para poder entender como calcular as questões solicitadas

import javax.swing.JOptionPane;
public class Solução7
{
    public static void main(String[] args)
    {   

         String anguloStr = JOptionPane.showInputDialog("Digite o ângulo em graus:");
        double angulo = Double.parseDouble(anguloStr);

        // Converte o ângulo para radianos (necessário para as funções trigonométricas em Java)
        double anguloRad = Math.toRadians(angulo);

        // Calcula as funções trigonométricas
        double seno = Math.sin(anguloRad);
        double cosseno = Math.cos(anguloRad);
        double tangente = Math.tan(anguloRad);
        double secante = 1 / cosseno;

        double cossecante = 1 / seno;
        double cotangente = 1 / tangente;

        //Essas linhas obtive ajuda na internet para descobrir essas funções mas não entendi muito


        // Exibe os resultados em uma caixa de diálogo
        String resultado = "Para o ângulo de " + angulo + " graus:\n" + "Seno: " + seno + "\n" + "Cosseno: " + cosseno + "\n" + "Tangente: " + tangente + "\n" + "Secante: " + secante + "\n" + "Cossecante: " + cossecante + "\n" + "Cotangente: " + cotangente;
            
        JOptionPane.showMessageDialog(null, resultado);
    } 
            catch (NumberFormatException e) 
            {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, digite um número.");
            }
}


//Mas mesmo assim o programa não roda, acredito que umas das funções que tentei aplicar não deram certo