class BankAccount {
    private int balance = 0;

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ", Balance: " + balance);
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + ", Balance: " + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal of " + amount + ", Balance: " + balance);
        }
    }

    public int getBalance() {
        return balance;
    }
}

class DepositThread extends Thread {
    private BankAccount account;
    private int amount;

    public DepositThread(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        account.deposit(amount);
    }
}

class WithdrawThread extends Thread {
    private BankAccount account;
    private int amount;

    public WithdrawThread(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        account.withdraw(amount);
    }
}

public class BankAccountSimulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Thread depositThread1 = new DepositThread(account, 100);
        Thread depositThread2 = new DepositThread(account, 200);
        Thread withdrawThread1 = new WithdrawThread(account, 50);
        Thread withdrawThread2 = new WithdrawThread(account, 150);

        depositThread1.start();
        depositThread2.start();
        withdrawThread1.start();
        withdrawThread2.start();
    }
}

// Dry Run
// Initialization:

// A BankAccount object named account is created with an initial balance of 0.
// Two DepositThread objects (depositThread1 and depositThread2) are created
// with amounts 100 and 200, respectively.
// Two WithdrawThread objects (withdrawThread1 and withdrawThread2) are created
// with amounts 50 and 150, respectively.
// Starting Threads:

// The start method is called on depositThread1, depositThread2,
// withdrawThread1, and withdrawThread2.
// This invokes the run method of each thread, which calls the deposit or
// withdraw method of the BankAccount object.
// Deposit Operations:

// depositThread1 calls account.deposit(100):
// The deposit method is synchronized to ensure thread safety.
// The balance is updated from 0 to 100.
// It prints: Deposited 100, Balance: 100.
// depositThread2 calls account.deposit(200):
// The deposit method is synchronized to ensure thread safety.
// The balance is updated from 100 to 300.
// It prints: Deposited 200, Balance: 300.
// Withdraw Operations:

// withdrawThread1 calls account.withdraw(50):
// The withdraw method is synchronized to ensure thread safety.
// The balance is updated from 300 to 250.
// It prints: Withdrew 50, Balance: 250.
// withdrawThread2 calls account.withdraw(150):
// The withdraw method is synchronized to ensure thread safety.
// The balance is updated from 250 to 100.
// It prints: Withdrew 150, Balance: 100.