package entities;

import interfaces.Imprimivel;

public class Livro implements Imprimivel {

    // Atributos
    private String titulo;
    private String autor;

    //Metodo construtor
    public Livro(String titulo,String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    //Implementação do Imprimivel
    @Override
    public void imprimir(){
        System.out.println(
                "Titulo: " + this.titulo +
                " Autor: "  + this.autor
        );
    }
}
