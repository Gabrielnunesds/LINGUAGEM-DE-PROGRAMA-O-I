import java.util.Scanner;

public class TesteRepeticao {
    public static void main(String[] args) {

        //while
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor inicial: ");
        int contador = sc.nextInt();

        System.out.println("Digite o valor final: ");
        int valorFinal = sc.nextInt();

        // Estrutura de repetição while
        while (contador < valorFinal){
            System.out.println("O valor do contador é: " + contador);

            //Incremento do contador em +1 por ciclo
            ++contador;
        }
    }
}
