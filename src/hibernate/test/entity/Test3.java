package hibernate.test.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.openSession();
            session.beginTransaction();

//            List<Employee> employeeList = session.createQuery("from Employee").getResultList();
//            for (Employee e:employeeList){
//                System.out.println(e);
//            }

            List<Employee> employeeList = session.createQuery("from Employee where name ='Elena' AND salary>600 ").getResultList();
            for (Employee e:employeeList){
              System.out.println(e);
           }

            session.getTransaction().commit();
            System.out.println("DONE!");
        } finally {
            factory.close();
        }

    }
}
