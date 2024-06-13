import java.util.Scanner;
import javax.swing.JOptionPane;

public class AccountTest {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bem vindo ao banco!");
        String client = JOptionPane.showInputDialog("Informe o nome do cliente: ");
        Account myAccount = new Account(client, 0);

        String mensagem1 = String.format("Conta no nome de %s criada com sucesso!", myAccount.getName());
        JOptionPane.showMessageDialog(null, mensagem1);

        double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor a depositar: "));
        String mensagem2 = String.format("Depositando R$ %.2f na conta...", valor);
        JOptionPane.showMessageDialog(null, mensagem2);
        //System.out.printf("%nDepositando R$ %.2f na conta...%n%n", valor);
        myAccount.deposit(valor);

        String mensagem3 = String.format("%s possui R$ %.2f de saldo.", myAccount.getName(), myAccount.getBalance());
        JOptionPane.showMessageDialog(null, mensagem3);
        //System.out.printf("%s possui R$ %.2f de saldo.%n%n",myAccount.getName(), myAccount.getBalance());
    }
}