class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount + ", New Balance: $" + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount + ", New Balance: $" + balance);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    private static final double WITHDRAWAL_LIMIT = 1000.00;

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= WITHDRAWAL_LIMIT && amount <= balance) {
            balance -= amount;
            System.out.println("Savings Account - Withdrawn: $" + amount + ", New Balance: $" + balance);
        } else {
            System.out.println("Savings Account - Withdrawal amount exceeds limit or insufficient balance.");
        }
    }
}

class CheckingAccount extends BankAccount {
    private static final double WITHDRAWAL_FEE = 1.50;

    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount + WITHDRAWAL_FEE <= balance) {
            balance -= (amount + WITHDRAWAL_FEE);
            System.out.println("Checking Account - Withdrawn: $" + amount + " (Fee: $" + WITHDRAWAL_FEE
                    + "), New Balance: $" + balance);
        } else {
            System.out.println("Checking Account - Withdrawal amount exceeds balance after fee.");
        }
    }
}

public class Problem_3 {
    public static void main(String[] args) {

        BankAccount savings = new SavingsAccount(2000.00);
        BankAccount checking = new CheckingAccount(2000.00);

        savings.deposit(500.00);
        checking.deposit(500.00);

        savings.withdraw(1100.00);
        savings.withdraw(500.00);

        checking.withdraw(100.00);
        checking.withdraw(2400.00);
    }
}
