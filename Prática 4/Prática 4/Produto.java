//3) Crie a classe Produto com seu construtor, métodos de acesso e modificadores e os
//atributos privados nome, do tipo String, preço, do tipo double, quantidade, do tipo
//int. Crie uma classe TesteProduto com um método main, onde você vai ler valores de
//um produto, instanciar um produto e exibir o produto criado.

public class Produto 
{
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;

    }
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;

    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade: " + quantidade);
    }
}