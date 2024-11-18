public class CurrentAccount extends Account {
    private float overdraftLimit;

    // Constructor
    public CurrentAccount(String accNumber, double balance, float overdraftLimit) {
        super(accNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    // Override withdraw method to consider overdraft limit

    public void withdraw(double amount) {
        double currentBalance = getBalance();
        if (amount > 0 && (currentBalance - amount) >= -overdraftLimit) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal denied. Overdraft limit exceeded.");
        }
    }

    // Override doUpdate method

    public void doUpdate() {
        if (getBalance() < 0) {
            System.out.println("Letter sent to customer: Your account is in overdraft!");
        }
    }
}
