public class User {
    private String name;
    private int age;
    private String email;
    private String userType;

    public User(String name, int age, String email, int userType) {
        validateName(name);
        validateAge(age);
        validateEmail(email);
        this.userType = userType == 1 ? "Director" : "Actor";
    }

    private void validateName(String name) {
        if (name == null) {
            System.out.println("Error: username is null");
            this.name = "unknown";
        } else if (name.isEmpty()) {
            System.out.println("Error: empty username!");
            this.name = "unknown";
        } else {
            this.name = name;
        }
    }

    private void validateAge(int age) {
        if (age >= 0 && age <= 130) {
            this.age = age;
        } else {
            System.out.println("Error: age is out of bounds!");
            this.age = 0;
        }
    }

    private void validateEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Error: '@' character is missing!");
            this.email = "default@gmail.com";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        validateName(name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        validateAge(age);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        validateEmail(email);
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", userType='" + userType + '\'' +
                '}';
    }
}
