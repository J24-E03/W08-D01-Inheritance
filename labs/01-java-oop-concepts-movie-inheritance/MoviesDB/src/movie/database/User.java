package movie.database;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {

    private String name;
    private int age;

    private String email;
    private String userType;
    private final ArrayList<String> USER_TYPES = new ArrayList<>(Arrays.asList("Actor", "Director"));

    public User(String name, int age, String email, String userType) {

        checkNameValidity(name);
        checkAgeValidity(age);
        checkTypeValidity(userType);

        this.email = email;

    }

    // Getters
    public String getName() {

        return name;
    }

    public int getAge() {
        return age;
    }


    public String getEmail() {
        return email;
    }

    public String getUserType() {
        return userType;
    }

    // Setters
    public void setName(String name) {
       checkNameValidity(name);
    }

    public void setAge(int age) {
        checkAgeValidity(age);
    }

    public void setEmail(String email) {
        checkEmailValidity(email);
    }

    public void setUserType(String userType) {
        checkTypeValidity(userType);
    }

    private void checkNameValidity(String name) {
        if (name.isBlank()) {
            System.out.println("User's name cannot be blank!");
            this.name = "Unknown User";
            return;
        }
        this.name = name;
    }

    private void checkAgeValidity(int age) {
        if (age < 0 || age > 130) {
            System.out.println("User's age is invalid!");
            this.age = 40;
            return;
        }
        this.age = age;
    }


    private void checkTypeValidity(String userType) {
       for (String type: USER_TYPES) {
           if (type.equalsIgnoreCase(userType)) {
               this.userType = userType;
               return;
           }
       }
       this.userType = "Actor";
    }

    private void checkEmailValidity(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";

        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);

        if (!matcher.matches()) {
            System.out.println("Email address is invalid.");
            this.email = "unknown";
            return;
        }
        this.email = email;
    }

    public void displayUserInfo() {
        System.out.println(Colors.GOLD_YELLOW + "Printing properties of User:" + Colors.BRIGHT_RED + name + Colors.BRIGHT_RED);
        System.out.println(Colors.DARK_GREEN + "Type" + Colors.GOLD_YELLOW + ": " + Colors.BRIGHT_BLUE + userType );
        System.out.println(Colors.DARK_GREEN + "Age" + Colors.GOLD_YELLOW + ": " + Colors.BRIGHT_BLUE + age) ;
        System.out.println(Colors.DARK_GREEN + "Email" + Colors.GOLD_YELLOW + ": " + Colors.BRIGHT_BLUE + email);
    }

    public String toString() {
        return "User type = " + userType + ", Name  = " + name + ", Age = " + age + ", Email = " + email;
    }
}
