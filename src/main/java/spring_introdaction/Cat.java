package spring_introdaction;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("catBean")
public class Cat implements Pet{

    public Cat() {
        System.out.println("Bean Cat is created");
    }

    @Override
    public void say() {
        System.out.println("Meow-meow");
    }

//    @PostConstruct
//    public void init(){
//        System.out.println("Class Cat: init method");
//    }
//
//    @PreDestroy
//    public void destroy(){
//        System.out.println("Class Cat: destroy method");
//    }
}
