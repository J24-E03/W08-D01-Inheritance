package exercise;

public class Dog extends Animal{

    private String furColor;

    public Dog(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }

    public String speak(){
        return "Bark Bark";
    }

}
