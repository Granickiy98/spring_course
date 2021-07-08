package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution(* aop.UniLibrary.*(..))")
    private void allMethodsFromUniLibrary(){
    }

    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
    private void returnMagazineFromUniLibrary(){
    }

    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
    private void allMethodsExceptReturnMagazineFromUniLibrary(){}


    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
    public void beforeAllMethodsExceptReturnMagazineAdvice(){
        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: Log №10");
    }

//    @Pointcut("execution(* aop.UniLibrary.get*())")
//    private void  allGetMethodsUniLibrary(){}
//
//    @Pointcut("execution(* aop.UniLibrary.return*())")
//    private void allReturnMethodsUniLibrary(){}
//
//    @Pointcut("allGetMethodsUniLibrary() || allReturnMethodsUniLibrary()")
//    private void allGetAndReturnMethodsUniLibrary(){}
//
//
//    @Before("allGetMethodsUniLibrary()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: writing Log №1");
//    }
//
//    @Before("allReturnMethodsUniLibrary()")
//    public void beforeReturnLoggingAdvice(){
//        System.out.println("beforeReturnLoggingAdvice: writing Log №2");
//    }
//
//    @Before("allGetAndReturnMethodsUniLibrary()")
//    public void beforeReturnMethodsUniLibrary(){
//        System.out.println("beforeReturnLoggingAdvice: writing Log №3");
//    }



//    @Pointcut("execution(* get*())")
//    private void allGEtMethods(){ }
//
//    @Before("allGEtMethods()")
//    public void beforeGetBookAdvice(){
//        System.out.println("beforeGetBookAdvice: trying to get book");
//    }
//
//    @Before("allGEtMethods()")
//    public void beforeGetSecurityAdvice(){
//        System.out.println("beforeGetSecurityAdvice: checking the rights to receive a book / magazine ");
//    }

}
