import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account myAccount = new Account();

        System.out.printf("Nome inicial da conta: %s%n%n", myAccount.getName());
        System.out.println("Por favor, informe o nome da conta:");
        String name = input.nextLine();
        myAccount.setName(name);
        System.out.println();
        System.out.printf("Nome da conta alterado para: %n%s%n", myAccount.getName());
    }
}