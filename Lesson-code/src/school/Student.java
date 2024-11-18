package school;

import java.util.ArrayList;
import java.util.Arrays;

public class Student extends User {

//  private: variable is only accessible in the current class
//  public: variable is accessible anywhere in my project
//  protected: variably is only accessible in the same package

    //    Attributes or Fields
    private String course;
//    put this in parent class at the end of lesson
    private final String COUNTRY = "Germany";
    private boolean isHandRaised = false;
    public static ArrayList<String> possibleCourses = new ArrayList<>(Arrays.asList("Java", "Web Dev", "Data"));


    //    constructor
//    is what we use to create the object
//    always the same name as the class
    public Student(String firstName, String lastName, String course, ArrayList<String> languages){
//      super(): stands for the constructor of the parent class
        super(firstName,lastName,languages);
        this.course = course;

    }

    //    overloading the constructor method
//    public school.Student(String firstName, String lastName, ArrayList<String> languages){
//        super("","",languages);
//        this.course = "Pending";
//    }



//    behavior: Methods

    public void changeHandRaise(){
        isHandRaised = !isHandRaised;
    }

//    Setters and Getters
//    are always public

    //    getter


    public String getCourse(){
        return course;
    }


    public String getCountry(){
        return COUNTRY;
    }

    public boolean getIsHandRaised(){
        return isHandRaised;
    }

//    setters




    public void setCourse(String course){

        if(possibleCourses.contains(course)){
            this.course = course;
        }
        System.out.println("Please enter either Java, Web Dev, or Data");
    }

    public static void addNewCourse(String course){
        if(!possibleCourses.contains(course)){
            possibleCourses.add(course);
        }
        System.out.println("Course already offered");
    }


    /*
       Exercise 1:
                  1. Create a setter for the course field
                  2. This setter should only allow the course to be updated if the value is of the following: {"Java", "Web Dev", "Data"}
                  3. If the user provides any other value than sout "Please enter either Java, Web Dev, or Data"

    */



    /*
        Bonus Exercise 1:
            1. Create a method that matches a student with a teacher
            2. matchStudent(school.school.Student student, school.school.Teacher teacher)
            3.
    */



    public String toString(){

        return "school.Student{country= " + COUNTRY +  ", isHandRaised= " + isHandRaised + ", course= "
                + course + "}";

    }



}