package spring_introdaction;

public class Cat implements Pet{

    public Cat() {
        System.out.println("Bean Cat is created");
    }

    @Override
    public void say() {
        System.out.println("Meow-meow");
    }
}
