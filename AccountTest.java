import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account myAccount = new Account("Chuck Norris", 0);

        System.out.print("Informe o valor a depositar na conta: ");
        double valor = input.nextDouble();
        System.out.printf("%nDepositando R$ %.2f na conta...%n%n", valor);
        myAccount.deposit(valor);
        System.out.printf("%s possui R$ %.2f de saldo.%n%n",myAccount.getName(), myAccount.getBalance());
    }
}