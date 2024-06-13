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
}
