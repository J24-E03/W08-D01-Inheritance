public class SavingsAccount extends Account {
    private float interest;

    public SavingsAccount(int accNumber, float interest) {
        super(accNumber);
        this.interest = interest;
    }

    protected void addInterest() {
        deposit(Math.round(getBalance() * getInterest()));
    }

    @Override
    protected void doUpdate() {
        addInterest();
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }
}
