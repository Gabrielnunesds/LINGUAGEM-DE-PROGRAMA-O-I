import javax.swing.*;
import java.util.Scanner;

public class Testadora2 {
    public static void main(String[] args) {

        // Exemplo de entrada de dados
        int cod_cidade = 10;

        // Exemplo de Scanner
        Scanner sc = new Scanner(System.in);
        String nome = sc.next();
        int idade = sc.nextInt();

        System.out.println(nome);
        System.out.println(idade);

        //Exemplo com Java swing(JOptionPane)
        String nome2 = (String) JOptionPane.showInputDialog(null,"Texto");
        System.out.println(nome2);
    }
}
