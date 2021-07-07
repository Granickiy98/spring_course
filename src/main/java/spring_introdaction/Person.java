package spring_introdaction;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    @Autowired
    private Pet pet;
    private String surname;
    private int age;

//    @Autowired
//    public Person(Pet pet) {
//        System.out.println("Bean Person is created");
//        this.pet = pet;
//    }

    public Person() {
        System.out.println("Bean Person is created");
    }

//    @Autowired
    public void setPet(Pet pet) {
        System.out.println("Class person: set pet");
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person set age");
        this.age = age;
    }

    public void callYourPet(){
        System.out.println("Hello my lovely pet !");
        pet.say();
    }
}
