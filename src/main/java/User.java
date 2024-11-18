
public class User {
    private String name;
    private int age;
    private String email;
    private String userType;



    public User(String name, int age, String email, String userType) {

        this.name = name;
        this.age = age;
        this.email = email;
        this.userType = userType;

    }
//getters for all fields.
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
    public int getAge() {
        return age;
    }
    public String getUserType() {
        return userType;
    }



// setters for all fields.

    public void setUserType(String userType) {

        this.userType = userType;
    }

    public void setName(String name) {
        if(name == null || name.isEmpty()){
            System.out.println("Name cannot be Empty");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if(age<0 || age > 130){
            System.out.println(" should be between 0 and 130.");
        }
        this.age = age;
    }
    public void setEmail(String email) {
        if(email == null || !email.contains("@")){
            System.out.println("email should contain an '@' symbol and it cannot be empty");
        }

        this.email = email;
    }
//void displayUserInfo(): Print the user’s details in a formatted way.
    public void displayUserInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("UserType: " + userType);

    }
    public String toString(){
        return "User Info [Name =" + name + ", Age = " + age + ", Email = " + email + "]";
    }
}





