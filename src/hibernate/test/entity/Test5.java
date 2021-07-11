package hibernate.test.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test5 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.openSession();
            session.beginTransaction();
//            Employee employee = session.get(Employee.class,7);
//            session.delete(employee);
            session.createQuery("delete Employee where name = 'Alexandr'").executeUpdate();
            session.getTransaction().commit();

            System.out.println("DONE!");
        } finally {
            factory.close();
        }

    }
}
