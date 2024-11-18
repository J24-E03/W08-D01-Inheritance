public class SavingsAccount extends Account{

    private float interest;
    public SavingsAccount(String accNumber, double balance, float interest) {
        super(accNumber, balance);
        this.interest = interest;
    }
    // Method to add interest
    public void addInterest() {
        double currentBalance = getBalance();
        double interestAmount = currentBalance * interest;
        double newBalance = currentBalance + interestAmount;
        // Set the new balance after interest
        // Using Math.round() to round the result to avoid precision issues
        double roundedBalance = Math.round(newBalance * 100.0) / 100.0;
        System.out.println("Interest added: " + roundedBalance);
        // Update balance with rounded value
        deposit(roundedBalance - currentBalance);
    }
    // Override doUpdate method
    public void doUpdate() {
        addInterest();
    }
}
