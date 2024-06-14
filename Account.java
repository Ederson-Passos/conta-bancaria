import javax.swing.*;

/*Uma classe que representa uma conta bancária com seus métodos.*/
public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;

        if(balance > 0.0) this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void deposit(double value) { if(value > 0.0) balance += value; }

    public double getBalance() { return balance; }

    public void withdraw(double value) {
        if(value <= balance) balance -= value;
        else JOptionPane.showMessageDialog(null, "Valor de débito excedeu o saldo da conta.");
    }

    public void displayAccount() {
        String mensagem1 = String.format("Conta\nTitular: %s\nSaldo: R$ %.2f", getName(), getBalance());
        JOptionPane.showMessageDialog(null, mensagem1);
    }
}
