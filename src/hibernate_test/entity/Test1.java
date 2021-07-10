package hibernate_test.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.openSession();
            Employee employee = new Employee("Alexandr", "Smirnov", "Sales", 600);
            session.beginTransaction();
            session.save(employee);
            session.getTransaction().commit();
            System.out.println("DONE!");
        } finally {
            factory.close();
        }

    }
}
