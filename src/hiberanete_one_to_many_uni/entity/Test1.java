package hiberanete_one_to_many_uni.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session = null;
        try {
//            session = factory.getCurrentSession();
//            Department department = new Department("HR",500,1500);
//            Employee employee1 = new Employee("Oleg","Ivanov",800);
//            Employee employee2 = new Employee("Elena","Sidorova",1000);
//            department.addEmployeeToDepartment(employee1);
//            department.addEmployeeToDepartment(employee2);
//            session.beginTransaction();
//
//            session.save(department);
//            session.getTransaction().commit();
//            System.out.println("DONE!");
//**********************************
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Department department = session.get(Department.class,3);
//            System.out.println(department);
//            System.out.println(department.getEmployeeList());
//
//            session.getTransaction().commit();
//            System.out.println("DONE!");

//*********************************************
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class,1);
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());
//
//            session.getTransaction().commit();
//            System.out.println("DONE!");
//************************
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class,5);
//
//            session.delete(employee);
//
//            session.getTransaction().commit();
//            System.out.println("DONE!");

        } finally {
            session.close();
            factory.close();
        }

    }
}
