public class CurrentAccount extends Account {

    float overdraftLimit;

    public CurrentAccount(int accNumber, float overdraftLimit) {
        super(accNumber);
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw(double amount) {


        if ( amount > 0 ) {
            if(getBalance()-amount<overdraftLimit){
                setBalance(getBalance() - amount);
            }else {
                System.err.println("Your withdraw request is too more than allowed amount!");
            }
        } else {
            System.err.println("Account.withdraw(...): cannot withdraw negative amount.");
        }
    }
}
