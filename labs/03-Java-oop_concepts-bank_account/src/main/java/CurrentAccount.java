public class CurrentAccount extends Account {
    private final float overdraftLimit;

    public CurrentAccount(int accNumber, float overdraftLimit) {
        super(accNumber);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0) {
            if (getBalance() - amount >= -overdraftLimit) {
                super.withdraw(amount);
                return;
            }
            System.out.println("Withdrawal denied: Overdraft limit exceeded.");
            return;
        }
            System.out.println("Cannot withdraw negative amount.");
    }

    @Override
    protected void doUpdate() {
        if (getBalance() < 0) {
            System.out.println("Sending letter: Account " + getAccountNumber() + " is in overdraft.");
        }
    }
}