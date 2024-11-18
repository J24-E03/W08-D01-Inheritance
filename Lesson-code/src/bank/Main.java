package bank;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Account myBankAccount = new SavingsAccount("Omar",1000,7);

        CheckingAccount checkingAccount = new CheckingAccount("Aron",2000,10384843);

//        mySavings = new CheckingAccount("Aron",2000,10384843);

        myBankAccount = checkingAccount;

        List<String> myArr = new ArrayList<>();

        myArr = new LinkedList<>();
//        mySavings.deposit(1000);


    }
}
