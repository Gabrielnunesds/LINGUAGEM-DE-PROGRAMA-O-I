package entities;

import interfaces.Produto;

import java.util.ArrayList;

public class Loja {

    private ArrayList<Produto> listaProduto;

    public Loja(){
        this.listaProduto = new ArrayList<>();
    }

    public void mostrarProduto(){
        for (Produto p : this.listaProduto){
            System.out.println("O meu produto é: " + p.getNome());
        }
    }

    public void adicionarProduto(Produto produto){
        this.listaProduto.add(produto);
    }
}
