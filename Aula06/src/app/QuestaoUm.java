package app;

public class QuestaoUm {

    public static void main(String[] args) {


        int soma = 0;  // inicializa a variável soma com zero
        int count = 0;  // inicializa a variável count com zero

        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {  // verifica se i é ímpar
                System.out.println(i);  // imprime i na tela
                soma += i;  // adiciona i à variável soma
                count++;  // incrementa count
            }
        }
        System.out.println("A soma dos números ímpares é: " + soma);
        System.out.println("O número de números ímpares é: " + count);
    }
}

