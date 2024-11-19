public class SavingsAccount extends Account {
    private float interest;

    public SavingsAccount(int accountNumber, float interest) {
        super(accountNumber);
        this.interest = interest;
    }

    public float getInterest() {
        return interest;
    }

    public void addInterest() {
        this.deposit(Math.round(this.getBalance() * this.getInterest()));
    }

    @Override
    public void doUpdate() {
        this.addInterest();
    }
}
