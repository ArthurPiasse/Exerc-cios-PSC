//11) Uma empresa de fornecimento de energia elétrica faz a leitura mensal dos...(Enunciado grande)

import javax.swing.JOptionPane;

public class Solução11 
{
    public static void main(String[] args) 
    {
        int codigo, tipo;
        double kWh, custo = 0, totalResidencial = 0, totalComercial = 0, totalIndustrial = 0, mediaResidencial = 0, mediaComercial = 0, contadorResidencial = 0, contadorComercial = 0;

        do {
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do consumidor (0 para sair):"));

            if (codigo != 0) 
            {
                kWh = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de kWh consumidos:"));
                tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo do consumidor (1-residencial, 2-comercial, 3-industrial):"));

                switch (tipo) 
                {
                    case 1 -> {
                        custo = kWh * 0.3;
                        totalResidencial += kWh;
                        contadorResidencial++;
                    }
                    case 2 -> {
                        custo = kWh * 0.5;
                        totalComercial += kWh;
                        contadorComercial++;
                    }
                    case 3 -> {
                        custo = kWh * 0.7;
                        totalIndustrial += kWh;
                    }
                }

                JOptionPane.showMessageDialog(null, "O custo total para o consumidor é: R$" + custo);
            }
        } 
        while (codigo != 0);

        // Cálculo da média
        if (contadorResidencial > 0) 
        {
            mediaResidencial = totalResidencial / contadorResidencial;
        }
        if (contadorComercial > 0) 
        {
            mediaComercial = totalComercial / contadorComercial;
        }

        // Impressão dos resultados finais
        JOptionPane.showMessageDialog(null, "Total de consumo residencial: " + totalResidencial + " kWh\n" +
                                            "Total de consumo comercial: " + totalComercial + " kWh\n" +
                                            "Total de consumo industrial: " + totalIndustrial + " kWh\n" +
                                            "Média de consumo residencial: " + mediaResidencial + " kWh\n" +
                                            "Média de consumo comercial: " + mediaComercial + " kWh");
    }
}

//nesse exercício tive que consultar a internet principalmente para o uso do switch o que facilitou o script a funcionar pois pelo enunciado fiquei confuso e tentei por if e else