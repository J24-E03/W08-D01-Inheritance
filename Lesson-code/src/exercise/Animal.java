package exercise;

/*
4 Access Modifiers

1. public: accessible anywhere in my project
2. private: only accessible within my class
3. default: only accessible within the package
4. protected: only accessible in the same package AND for subclasses
* */
public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String speak(){
        return "The animal makes a sound";
    }

//    public String toString(){
//        return "";
//    }
}
