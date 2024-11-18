public class AccountOperations {
    public static void main(String[] args) {
        // Create different types of accounts
        Account account1 = new Account("ACC123", 1000.0);
        SavingsAccount account2 = new SavingsAccount("SAV456", 2000.0, 0.05f);  // 5% interest
        CurrentAccount account3 = new CurrentAccount("CUR789", 500.0, 100.0f);  // 100 overdraft limit

        // Deposit and withdraw for testing
        account1.deposit(500.0);
        account1.withdraw(200.0);

        account2.deposit(100.0);
        account2.withdraw(50.0);

        account3.deposit(200.0);
        account3.withdraw(700.0);  // Should go into overdraft

        // Create an array of accounts and create a bank instance
        Account[] accounts = {account1, account2, account3};
        Bank bank = new Bank(accounts);

        // Call update on the bank (this will call doUpdate on each account)
        bank.update();
    }
    }

