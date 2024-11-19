public class CurrentAccount extends Account {

    float overdraftLimit;

    public CurrentAccount(int accNumber, float overdraftLimit) {
        super(accNumber);
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw(double amount) {
        double currentBalance = getBalance();

        if ( amount > 0 ) {
            if(currentBalance-amount<overdraftLimit){
                currentBalance -= amount;
                Account.set
            }else {

                System.err.println("Account.withdraw(...): cannot withdraw negative amount.");
            }
        } else {
            System.err.println("Account.withdraw(...): cannot withdraw negative amount.");
        }
    }
}
