package app;

import entities.ContaCorrente;
import entities.Titular;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        //Instanciar Scanner
        Scanner sc = new Scanner(System.in);

        ContaCorrente cc1 = new ContaCorrente(1);

        //Criação do objeto titular da conta
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite seu CPF: ");
        String cpf = sc.nextLine();
        cc1.setTitular(new Titular(nome, cpf));

        //Depositando valores
        cc1.depositar(10.0);
        cc1.depositar(1050.86);
        cc1.sacar(0.87);
        System.out.println("Seu saldo é: R$ " + cc1.verificarSaldo());
    }
}
