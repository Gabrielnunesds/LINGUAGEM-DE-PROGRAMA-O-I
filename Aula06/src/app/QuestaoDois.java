package app;
import java.util.Scanner;

public class QuestaoDois {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        for (int i = 0; i <= numero; i++) {
            System.out.print(i + " ");
        }

        System.out.println(); // imprime uma nova linha
        sc.close();
    }
}

