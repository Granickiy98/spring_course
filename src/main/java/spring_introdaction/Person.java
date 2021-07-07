package spring_introdaction;

public class Person {
    private Pet pet;

    public Person(Pet pet) {
        System.out.println("Bean Person is created");
        this.pet = pet;
    }

    public Person() {
        System.out.println("Bean Person is created");
    }

    // setPet -> setPet
    public void setPet(Pet pet) {
        System.out.println("Class person: set pet");
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("Hello my lovely pet !");
        pet.say();
    }
}
