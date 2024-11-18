package school;

import java.util.ArrayList;

public class User {

//    DRY principle: Don't Repeat Yourself

//    Attributes or fields
    private String firstName;
    private String lastName;
    private ArrayList<String> languages;

//    constructor
    public User(String firstName, String lastName, ArrayList<String> languages){
        this.firstName = firstName;
        this.lastName = lastName;
        this.languages = languages;

    }

//    getters

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public ArrayList<String> getLanguages(){
        return languages;
    }

//    setters

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setLanguages(ArrayList<String> languages) {
        this.languages = languages;
    }

    public void addLanguage(String language){
        if(!languages.contains(language)){
            languages.add(language);
        }
    }

    //    methods

    public String introduceSelf(){
        return "Hello my name is " + firstName;
    }


    public String methodForAll(){
        return "Method in user";
    }



}
