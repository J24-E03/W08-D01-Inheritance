public class Bank {
    private Account[] accounts;

    // Constructor to initialize the bank with accounts
    public Bank(Account[] accounts) {
        this.accounts = accounts;
    }

    // Update method that calls doUpdate() for each account
    public void update() {
        for (Account account : accounts) {
            account.doUpdate();  // Calls the doUpdate method for each account type
        }
    }
}
