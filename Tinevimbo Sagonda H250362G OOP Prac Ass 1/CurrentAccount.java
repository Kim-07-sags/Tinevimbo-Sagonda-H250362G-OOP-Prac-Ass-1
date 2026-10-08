public class CurrentAccount extends Account {

    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal must be positive.");
        } else if (balance - amount >= -overdraftLimit) {
            balance -= amount;
        } else {
            System.out.println("Withdrawal rejected: overdraft limit exceeded.");
        }
    }

    @Override
    public void endOfMonth() {
        balance -= 10;
    }
}