package bank;

/*

3 classes

1. Account
2. CheckingAccount
3. SavingsAccount

Account ----> CheckingAccount
Account ----> SavingsAccount
*/

public class Account {

    private String accountOwner;
    private long accountBalance;

    public Account(String accountOwner, long accountBalance){
        this.accountBalance = accountBalance;
        this.accountOwner = accountOwner;
    }



    public String getAccountOwner(){
        return accountOwner;
    }

    public long getAccountBalance(){
        return accountBalance;
    }

    public void setAccountOwner(String newOwner){
        accountOwner = newOwner;
    }

    public void setAccountBalance(long newBalance){
        accountBalance = newBalance;
    }

    public String toString(){
        return "balance: " + accountBalance + ", owner: " + accountOwner;
    }


    public void withdraw(long amount){
        accountBalance-= amount;
    }

    public void deposit(long amount){
        accountBalance+=amount;
    }


}
