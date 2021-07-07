package spring_introdaction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfirmWithAnnotations1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Cat cat = context.getBean("cat",Cat.class);
        cat.say();

        context.close();
    }
}
