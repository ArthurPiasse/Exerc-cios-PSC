//1) Crie a classe Turma com seu construtor, métodos de acesso e modificadores e os
//atributos privados nome, do tipo String, curso, do tipo String, quantidadeDeAlunos,
//do tipo int, serie, do tipo int.

    public class Solução1  
    {
    private String nome;
    private String curso;
    private int quantidadeDeAlunos;
    private int serie;

    public Solução1(String n, String c, int q, int s)
    {
        this.nome = n;
        this.curso = c;
        this.quantidadeDeAlunos = q;
        this.serie = s;
    }
    public String getNome() 
    {
        return nome;
    }
    public void setNome(String nome) 
    {
        this.nome = nome;
    }
    public String getCurso() 
    {
        return curso;
    }
    public void setCurso(String curso) 
    {
        this.curso = curso;
    }
    public int getQuantAlunos() 
    {
        return quantidadeDeAlunos;
    }
    public void setQuantAlunos(int quantidadeDeAlunos) 
    {
        this.quantidadeDeAlunos = quantidadeDeAlunos;
    }
    public int getSerie() 
    {
        return serie;
    }
    public void setSerie(int serie) 
    {
        this.serie = serie;
    }
}