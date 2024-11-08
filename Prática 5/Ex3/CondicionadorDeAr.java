public class CondicionadorDeAr {
    private Termostato termostato;
    private boolean ligado;

    public CondicionadorDeAr() {
        this.termostato = new Termostato();
        this.ligado = false;
    }

    public boolean isLigado() {
        return ligado;
    }

    public Termostato getTermostato() {
        return termostato;
    }

    public void ligar() {
        ligado = true;
    }

    public void desligar() {
        ligado = false;
    }

    public void aumentarTemperatura() {
        if (ligado) {
            if (termostato.getTemperatura() < 28) {
                termostato.setTemperatura(termostato.getTemperatura() + 1);
            } else {
                JOptionPane.showMessageDialog(null, "A temperatura não pode ser aumentada além de 28 graus.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Condicionador de ar está desligado.");
        }
    }

    public void reduzirTemperatura() {
        if (ligado) {
            if (termostato.getTemperatura() > 15) {
                termostato.setTemperatura(termostato.getTemperatura() - 1);
            } else {
                JOptionPane.showMessageDialog(null, "A temperatura não pode ser reduzida abaixo de 15 graus.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Condicionador de ar está desligado.");
        }
    }

    public void imprimirTemperatura() {
        if (ligado) {
            JOptionPane.showMessageDialog(null, "Temperatura atual: " + termostato.getTemperatura() + " graus.");
        } else {
            JOptionPane.showMessageDialog(null, "Condicionador de ar está desligado.");
        }
    }
}
