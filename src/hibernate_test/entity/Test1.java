package hibernate_test.entity;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(hibernate_test.entity.Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.openSession();
            hibernate_test.entity.Employee employee = new Employee("Alexandr", "Ivanov", "IT", 600);
            session.beginTransaction();
            session.save(employee);
            session.getTransaction().commit();
            System.out.println(employee);

            System.out.println("DONE!");
        } finally {
            factory.close();
        }

    }
}
