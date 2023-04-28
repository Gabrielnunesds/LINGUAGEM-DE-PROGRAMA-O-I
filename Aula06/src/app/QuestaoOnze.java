package app;

import entidadeOnze.Produto;

public class QuestaoOnze {
    public static void main(String[] args) {

        Produto produto = new Produto("Laptop", 150, 3.000);

        System.out.println("Produto: " + produto.getNome());
        System.out.println("Quantidade: " + produto.getQuantidade());
        System.out.println("Preço: R$" + produto.getValor());

        System.out.println();

        produto.comprarEstoque(900);

        System.out.println();
        System.out.println("Quantidade: " + produto.getQuantidade());
        System.out.println();

        produto

    }
}
