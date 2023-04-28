package application;

import entities.Loja;
import entities.Livro;


public class App {
    public static void main(String[] args) {

        Loja loja_lagoa = new Loja();

        Livro livro1 = new Livro(
                "Linux para todos",
                "Livro de Linux",
                250.99,
                "Williams",
                320
        );

        Livro livro2 = new Livro(
                "Java para todos",
                "Livro de Java",
                300.00,
                "Willis",
                450
        );

        System.out.println("--- Aqui esta adicionando os livros ---");
        loja_lagoa.adicionarProduto(livro1);
        loja_lagoa.adicionarProduto(livro2);

        System.out.println("--- Aqui esta listando os produtos ---");
        loja_lagoa.mostrarProduto();

    }
}
