//2) Crie a classe TesteTurma com o método main. De modo análogo ao exemplo, peça
//para o usuário entrar com os valores necessários para criar uma turma, instancie um
//objeto Turma e depois exiba os dados da turma criada. Depois, peça para o usuário
//uma nova quantidade de alunos, altere o valor do atributo e exiba os dados
//novamente.

public class Solução2 
{
    private String nome;
    private double preco;
    private int quantidade;
    public String getNome() {
        return nome;
    }

    public Solução2(String n, double p, int q )
    {
        this.nome = n;
        this.preco = p;
        this.quantidade = q;
    }
    public void setNome(String nome) 
    {
        this.nome = nome;
    }
    public double getPreco() 
    {
        return preco;
    }
    public void setPreco(double preco) 
    {
        this.preco = preco;
    }
    public int getQuantidade() 
    {
        return quantidade;
    }
    public void setQuantidade(int quantidade) 
    {
        this.quantidade = quantidade;
    }
}