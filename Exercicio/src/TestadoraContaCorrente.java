import java.sql.SQLOutput;

public class TestadoraContaCorrente {
    public static void main(String[] args) {
        //Criar uma Conta Corrente
        ContaCorrente cc1 = new ContaCorrente("Messi", 13);

        System.out.println("Meu saldo é: " + cc1.verficarSaldo());
        cc1.depositar(1350.99);
        cc1.sacar(0.99);
        System.out.println("Meu saldo é: " + cc1.verficarSaldo());
        cc1.sacar(1500);

    }
}
