package application;

import entities.Livro;
import entities.Revista;
import interfaces.Imprimivel;

public class app {

    public static void main(String[] args) {

        //Instancia de vetor
        Imprimivel[] vetorImprimiveis = new Imprimivel[2];

        //Guardar um livro
        vetorImprimiveis[0] = new Livro(
                "Linux um guia prático",
                "Sobell");

        //Guardar uma revista
        vetorImprimiveis[1] = new Revista(
                "Actia Sentia",
                2023);

        for (Imprimivel item: vetorImprimiveis){
            item.imprimir();
        }
    }
}
