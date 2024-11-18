package bank;

public class CheckingAccount extends Account {

    private int debitCard;

    public CheckingAccount(String accountOwner, long accountBalance, int debitCard){
        super(accountOwner,accountBalance);
        this.debitCard = debitCard;
    }



}
