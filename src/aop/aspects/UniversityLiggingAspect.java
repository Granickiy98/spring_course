package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLiggingAspect {

//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice(){
//        System.out.println("beforeGetStudentsLoggingAdvice: logging list student. Before method getStudents");
//    }


//    @AfterReturning(pointcut = "execution(* getStudents())",returning = "students")
//    public void  afterReturningGetStudentsLoggingAdvice(List<Student> students){
//        Student firstStudent = students.get(0);
//        String nameSurname = firstStudent.getNameSurname();
//        nameSurname = "Mr. " + nameSurname;
//        firstStudent.setNameSurname(nameSurname);
//
//        double avgGrade = firstStudent.getAvgGrade();
//        avgGrade = avgGrade+1;
//        firstStudent.setAvgGrade(avgGrade);
//
//        System.out.println("afterReturningGetStudentsLoggingAdvice: logging get list student. After method getStudents");
//    }


//    @AfterThrowing(pointcut = "execution(* getStudents())",throwing = "exception")
//    public void afterThrowingingGetStudentsLoggingAdvice(Throwable exception){
//        System.out.println("afterReturningGetStudentsLoggingAdvice logging exception : " + exception);
//    }

    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice(){
        System.out.println("afterGetStudentsLoggingAdvice logging normal end methods or caught exception");
    }
}
