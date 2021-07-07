package spring_introdaction;

public class Dog implements Pet{

    private  String name;

    public Dog() {
        System.out.println("Bean Dog is Created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void say(){
        System.out.println("Bow-wow");
    }
}
