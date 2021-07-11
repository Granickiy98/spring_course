package hibernate.test.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test4 {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.openSession();
            session.beginTransaction();
            session.createQuery("update Employee set salary = 1000 where name = 'Alexandr'").executeUpdate();
//
//            Employee employee = session.get(Employee.class,4);
//
//            employee.setName("Ivan");
//            employee.setDepartment("HR");
//            employee.setSurname("Ivanov");
            session.getTransaction().commit();

            System.out.println("DONE!");
        } finally {
            factory.close();
        }

    }
}
