package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {
    @Around("execution(public  String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: in library trying to return book ");

        Object targetMethodResult = null;
        try {
           targetMethodResult = proceedingJoinPoint.proceed();
        }catch (Exception e){
            System.out.println("aroundReturnBookLoggingAdvice would be caught exception: " + e);
            throw  e;
        }


        System.out.println("aroundReturnBookLoggingAdvice: in library returned book ");

        return targetMethodResult;
    }
}
