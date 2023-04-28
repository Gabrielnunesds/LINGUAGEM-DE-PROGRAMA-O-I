package entities;

import interfaces.Produto;

public class Livro implements Produto {

    //Atributos
    private String nome;
    private String descricao;
    private double preco;
    private String autor;
    private int numeroDePaginas;

    //Metodo Construtor
    public Livro(String nome, String descricao, double preco, String autor, int numeroDePaginas){
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public String getDescricao() {
        return this.descricao;
    }

    @Override
    public double getPreco() {
        return this.preco;
    }


}
