package school;

import java.util.ArrayList;

//what gets inhereted:
//  1. all the attributes
//  2. all the methods
public class Teacher extends User{



    private ArrayList<String> courses;
    private String country;
    private ArrayList<Student> students;


    public Teacher(String firstName,String lastName, ArrayList<String> courses, ArrayList<String> languages, String country, ArrayList<Student> students){
        super(firstName, lastName, languages);
        System.out.println(Student.possibleCourses);
        this.courses = courses;
        this.country = country;
        this.students = students;
    }


    public String getCountry(){
        return country;
    }

    public ArrayList<String> getCourses(){
        return courses;
    }

    public ArrayList<Student> getStudents(){
        return students;
    }

    public String toString(){


        return "school.school.Teacher{country= " + country + ", \nstudents= " + students + ", courses= "
                + courses + "}" + " and the hex representation is";
    }


//    Overriding
    public String introduceSelf(){
        return "Hello my name is " + getFirstName() + " And I will be your teacher";
    }


    public String methodForAll(){
        return "Method in teacher class";
    }

}