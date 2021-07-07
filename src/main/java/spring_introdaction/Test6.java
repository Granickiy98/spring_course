package spring_introdaction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(myConfig.class);
        Person person = context.getBean("personBean",Person.class);
        person.callYourPet();
        context.close();
    }
}
