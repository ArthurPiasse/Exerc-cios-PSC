public class Tarefeiro extends Empregado {
    private double valorPorTarefa;
    private int numeroDeTarefas;

    public Tarefeiro(String nome, String sobrenome, String cpf, double valorPorTarefa, int numeroDeTarefas) {
        super(nome, sobrenome, cpf, valorPorTarefa * numeroDeTarefas);
        this.valorPorTarefa = valorPorTarefa;
        this.numeroDeTarefas = numeroDeTarefas;
    }

    public double getValorPorTarefa() {
        return valorPorTarefa;
    }

    public void setValorPorTarefa(double valorPorTarefa) {
        this.valorPorTarefa = valorPorTarefa;
        setSalario(valorPorTarefa * numeroDeTarefas);
    }

    public int getNumeroDeTarefas() {
        return numeroDeTarefas;
    }

    public void setNumeroDeTarefas(int numeroDeTarefas) {
        this.numeroDeTarefas = numeroDeTarefas;
        setSalario(valorPorTarefa * numeroDeTarefas);
    }

    @Override
    public String dados() {
        return super.dados() + "\nTipo: Tarefeiro";
    }
}
