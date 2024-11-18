public class CurrentAccount extends Account {
    private float overdraftLimit;

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
            System.out.println("Error: the amount is over the limit!");
        }
    }

    public float getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(float overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    protected void doUpdate() {
        if (this.getBalance() < 0) {
            System.out.println("Warning: you're in overdraft!");
        }
    }
}
