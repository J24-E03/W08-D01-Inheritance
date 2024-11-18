public class CurrentAccount extends Account {
    private final float overdraftLimit;

    public CurrentAccount(int accountNumber, float overdraftLimit) {
        super(accountNumber);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0) {
            if (this.getBalance() - amount >= -this.getOverdraftLimit()) {
                super.withdraw(amount);
                return;
            }

            System.err.println("CurrentAccount.withdraw(...): cannot withdraw more than overdraft limit.");
            return;
        }

        System.err.println("CurrentAccount.withdraw(...): cannot withdraw negative amount.");
    }

    @Override
    public void doUpdate() {
        if (this.getBalance() < 0) {
            this.withdraw(this.getBalance() * 0.1);
        }
    }
}
