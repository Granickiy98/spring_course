package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail;

import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = null;
        try {
//            session = factory.openSession();
//            Employee employee = new Employee("Vlad","Ivanov","HR",850);
//            Detail detail = new Detail("Dnepr","0973145465","vlados@gmail.com");
//
//            employee.setEmpDetail(detail);
//            detail.setEmployee(employee);
//
//            session.beginTransaction();
//
//            session.save(detail);
//
//            session.getTransaction().commit();
//            System.out.println("DONE!");

//            session = factory.openSession();
//            session.beginTransaction();
//
//            Detail detail = session.get(Detail.class,4);
//            System.out.println(detail.getEmployee());
//
//            session.getTransaction().commit();
//            System.out.println("DONE!");

            session = factory.openSession();
            session.beginTransaction();

            Detail detail = session.get(Detail.class,1);

            session.delete(detail);

            session.getTransaction().commit();
            System.out.println("DONE!");

        } finally {
            session.close();
            factory.close();
        }

    }
}
