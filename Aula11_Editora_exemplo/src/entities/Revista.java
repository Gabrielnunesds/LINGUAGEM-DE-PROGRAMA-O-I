package entities;

import interfaces.Imprimivel;

public class Revista implements Imprimivel {

    // Atributos
    private String nome;
    private int numero;

    //Metodo construtor
    public Revista(String nome,int numero){
        this.nome = nome;
        this.numero = numero;
    }

    //Implementação do Imprimivel
    @Override
    public void imprimir(){
        System.out.println(
                "Nome: " + this.nome +
                " Numero: "  + this.numero
        );
    }
}
