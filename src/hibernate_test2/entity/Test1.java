package hibernate_test2.entity;

import hibernate_test2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = null;
        try {
//            Session session = factory.openSession();
//
//            Employee employee = new Employee("Yuriy","Granickiy","IT",500);
//            Detail detail = new Detail("Kamenskoe","0977233844","granickiy@gmail.com");
//            employee.setEmpDetail(detail);
//
//            session.beginTransaction();
//
//            session.save(employee);
//
//            session.getTransaction().commit();
//            System.out.println("DONE!");

//            Session session = factory.openSession();
//
//            Employee employee = new Employee("Ivan","Smirnov","Sales",700);
//            Detail detail = new Detail("Moscow","7865243522","Oleg23@mail.ru");
//            employee.setEmpDetail(detail);
//
//            session.beginTransaction();
//
//            session.save(employee);
//
//            session.getTransaction().commit();
//            System.out.println("DONE!");

//            session = factory.openSession();
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class,1);
//            System.out.println(employee.getEmpDetail() );
//
//
//            session.getTransaction().commit();
//            System.out.println("DONE!");

            session = factory.openSession();
            session.beginTransaction();

            Employee employee = session.get(Employee.class,2);
            session.delete(employee);


            session.getTransaction().commit();
            System.out.println("DONE!");
        } finally {
            session.close();
            factory.close();
        }

    }
}
