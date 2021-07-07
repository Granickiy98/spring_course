package spring_introdaction;

public class Dog implements Pet{

    public Dog() {
        System.out.println("Bean Dog is Created");
    }

    @Override
    public void say(){
        System.out.println("Bow-wow");
    }
}
