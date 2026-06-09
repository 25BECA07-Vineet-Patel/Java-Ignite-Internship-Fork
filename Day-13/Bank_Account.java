class BankAccount {

    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public synchronized void withdraw(int amount) {

        if (balance >= amount) {

            balance -= amount;

            System.out.println(
                    Thread.currentThread().getName()
                            + " withdrew ₹" + amount
                            + " | Balance = ₹" + balance);
        } else {

            System.out.println(
                    Thread.currentThread().getName()
                            + " tried to withdraw ₹" + amount
                            + " but insufficient balance.");
        }
    }

    public synchronized void deposit(int amount) {

        balance += amount;

        System.out.println(
                Thread.currentThread().getName()
                        + " deposited ₹" + amount
                        + " | Balance = ₹" + balance);
    }
}

class WithdrawThread extends Thread {

    private BankAccount account;

    public WithdrawThread(BankAccount account) {
        this.account = account;
    }

    public void run() {

        for (int i = 1; i <= 5; i++) {

            int amount = (int) (Math.random() * 1501) + 500;

            account.withdraw(amount);

            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}

class DepositThread extends Thread {

    private BankAccount account;

    public DepositThread(BankAccount account) {
        this.account = account;
    }

    public void run() {

        for (int i = 1; i <= 5; i++) {

            int amount = (int) (Math.random() * 1501) + 500;

            account.deposit(amount);

            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}

public class Bank_Account {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(10000);

        WithdrawThread wt = new WithdrawThread(account);

        DepositThread dt = new DepositThread(account);

        wt.setName("Withdrawal Thread");
        dt.setName("Deposit Thread");

        wt.start();
        dt.start();
    }
}