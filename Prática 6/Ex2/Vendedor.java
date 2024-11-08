public class Vendedor extends Empregado {
    private double comissao;

    public Vendedor(String nome, String sobrenome, String cpf, double salario, double comissao) {
        super(nome, sobrenome, cpf, salario + comissao);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
        setSalario(getSalario() + comissao);
    }

    @Override
    public String dados() {
        return super.dados() + "\nTipo: Vendedor";
    }
}
