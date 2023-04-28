package aplicacao;

import entidades.*;

public class App {
    public static void main(String[] args) {

        // Instanciando um quadrado
        Quadrado q  = new Quadrado(Cores.ROXO, 12, 12.5);
        System.out.println("A cor do quadrado é: " + q.getCor());

        Forma f =  new Quadrado(Cores.VERMELHO, 5, 5);
        System.out.println("A cor do quadrado é: " + f.getCor());

        Forma f2 = new Circulo(Cores.AZUL, 10);
        System.out.println("O valor da area do circulo é: "+ f2.calcularArea());

        Forma f3 = new Triangulo(Cores.PRETO, 5, 6, 9);
        System.out.println("o valor da area do triangulo é" + f3.calcularArea());
    }
}
