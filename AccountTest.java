import java.util.Scanner;
import javax.swing.JOptionPane;

public class AccountTest {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bem vindo ao banco!");
        String client = JOptionPane.showInputDialog("Informe o nome do cliente: ");
        Account myAccount = new Account(client, 0);

        myAccount.displayAccount();

        double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor a depositar: "));
        String mensagem2 = String.format("Depositando R$ %.2f na conta...", valor);
        JOptionPane.showMessageDialog(null, mensagem2);
        //System.out.printf("%nDepositando R$ %.2f na conta...%n%n", valor);
        myAccount.deposit(valor);

        myAccount.displayAccount();
        //System.out.printf("%s possui R$ %.2f de saldo.%n%n",myAccount.getName(), myAccount.getBalance());

        double saque = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor a sacar: "));
        String mensagem4 = String.format("Sacando R$ %.2f na conta...", saque);
        JOptionPane.showMessageDialog(null, mensagem4);
        myAccount.withdraw(saque);

        myAccount.displayAccount();
    }
}