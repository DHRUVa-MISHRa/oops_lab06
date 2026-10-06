package labsheet06.question08;

abstract class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Savings deposit successful.");
        } else {
            System.out.println("Deposit must be greater than zero.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance - amount >= 100.0) {
            balance -= amount;
            System.out.println("Savings withdrawal successful.");
        } else {
            System.out.println("Savings withdrawal denied; keep at least 100 in the account.");
        }
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Current account deposit successful.");
        } else {
            System.out.println("Deposit must be greater than zero.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Current account withdrawal successful.");
        } else {
            System.out.println("Current account withdrawal denied; insufficient balance.");
        }
    }
}

public class Question08AccountTypes {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount(500.00);
        BankAccount current = new CurrentAccount(500.00);

        savings.deposit(100.00);
        savings.withdraw(450.00);
        savings.withdraw(100.00);
        current.deposit(100.00);
        current.withdraw(550.00);
        System.out.println("Savings balance: " + savings.getBalance());
        System.out.println("Current balance: " + current.getBalance());
    }
}