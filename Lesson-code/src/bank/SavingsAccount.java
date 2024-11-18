package bank;

public class SavingsAccount extends Account {

    private int interestRate;

    public SavingsAccount(String accountOwner, long accountBalance, int interestRate){
        super(accountOwner,accountBalance);
        this.interestRate = interestRate;

    }

    public String toString(){
        return "SavingsAccount{interestRate= " + interestRate  + ", "+ super.toString() + "}";
    }


}
