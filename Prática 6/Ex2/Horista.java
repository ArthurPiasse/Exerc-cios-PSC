public class Horista extends Empregado {
    private double horasTrabalhadas;
    private double valorPorHora;

    public Horista(String nome, String sobrenome, String cpf, double horasTrabalhadas, double valorPorHora) {
        super(nome, sobrenome, cpf, horasTrabalhadas * valorPorHora);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
        setSalario(horasTrabalhadas * valorPorHora);
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
        setSalario(horasTrabalhadas * valorPorHora);
    }

    @Override
    public String dados() {
        return super.dados() + "\nTipo: Horista";
    }
}
