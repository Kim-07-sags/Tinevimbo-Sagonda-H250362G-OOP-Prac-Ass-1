public class SavingsAccount extends Account {

    private double minimumBalance;

    public SavingsAccount(String accountNumber, double balance, double minimumBalance) {
        super(accountNumber, balance);
        this.minimumBalance = minimumBalance;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal must be positive.");
        } else if (balance - amount >= minimumBalance) {
            balance -= amount;
        } else {
            System.out.println("Withdrawal rejected: minimum balance required.");
        }
    }

    @Override
    public void endOfMonth() {
        balance += balance * 0.05;
    }
}