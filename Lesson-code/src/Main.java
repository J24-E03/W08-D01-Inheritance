import bank.CheckingAccount;
import bank.SavingsAccount;
import exercise.Dog;
import school.Student;
import school.Teacher;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Student maryam = new Student("Maryam","Mohammadi","Java",new ArrayList<>(Arrays.asList("English","German")));
//
//        ArrayList<Student> students = new ArrayList<>(Arrays.asList(maryam));
//
//        Teacher omar = new Teacher("Omar","Kamal",new ArrayList<>(Arrays.asList("Java")),new ArrayList<>(Arrays.asList("English","Arabic")),"Bahrain",students);

//        System.out.println(maryam.introduceSelf());
//        System.out.println(omar.introduceSelf());
//
//        System.out.println(omar.methodForAll());

        CheckingAccount myAccount = new CheckingAccount("Omar",10000,1017258889);

        System.out.println(myAccount.getAccountBalance());
        myAccount.deposit(20);
        System.out.println(myAccount.getAccountBalance());


        SavingsAccount mySavingsAccount = new SavingsAccount("Aron",200000,7);

        System.out.println(mySavingsAccount.toString());


        Dog dog = new Dog("Lucky",2,"brown");

//        System.out.println(dog.name);


    }
}