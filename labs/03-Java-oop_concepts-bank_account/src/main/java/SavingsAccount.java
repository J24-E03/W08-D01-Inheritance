public class SavingsAccount extends Account {
    private final float interest;

    public SavingsAccount(int accNumber, float interest) {
        super(accNumber);
        this.interest = interest;
    }

    public void addInterest() {
        double newBalance = getBalance() * (1 + interest);
        withdraw(getBalance());
        deposit(Math.round(newBalance));
    }

    @Override
    protected void doUpdate() {
        addInterest();
    }
}