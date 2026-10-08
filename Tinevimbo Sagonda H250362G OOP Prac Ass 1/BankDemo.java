import java.util.ArrayList;
import java.util.List;

public class BankDemo {

    public static void main(String[] args) {

        List<Account> accounts = new ArrayList<>();

        accounts.add(new SavingsAccount("S001", 1000, 500));
        accounts.add(new CurrentAccount("C001", 500, 300));

        for (Account account : accounts) {

            System.out.println("Account: " + account.accountNumber);
            System.out.println("Starting balance: " + account.getBalance());

            account.withdraw(600);

            System.out.println("Balance after withdrawal: " + account.getBalance());

            account.endOfMonth();

            System.out.println("Balance after month-end: " + account.getBalance());
            System.out.println();
        }
    }
}