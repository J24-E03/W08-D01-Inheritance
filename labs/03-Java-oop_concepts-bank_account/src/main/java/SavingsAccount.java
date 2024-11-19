public class SavingsAccount extends Account {

    float interest;

    public SavingsAccount(int accNumber, float interest) {
        super(accNumber);
        this.interest = interest;
    }

    public double addInterest() {
        return getBalance() * interest;
    }


}
