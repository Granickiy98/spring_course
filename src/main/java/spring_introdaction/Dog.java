package spring_introdaction;

import org.springframework.stereotype.Component;

@Component
//dog
public class Dog implements Pet{

//    private  String name;

    public Dog() {
        System.out.println("Bean Dog is Created");
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public void init(){
        System.out.println("Class Dog: init method");
    }
    public void destroy(){
        System.out.println("Class Dog: destroy method");
    }

    @Override
    public void say(){
        System.out.println("Bow-wow");
    }
}
