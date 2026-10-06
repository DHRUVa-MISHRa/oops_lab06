package labsheet06.question05;

class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Deposit must be greater than zero.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Withdrawal failed.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance - amount >= 100.0) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Withdrawal denied: at least 100 must remain in the account.");
        }
    }
}

public class Question05SavingsAccount {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(500.00);
        account.deposit(100.00);
        account.withdraw(250.00);
        account.withdraw(260.00);
        System.out.println("Balance: " + account.getBalance());
    }
}