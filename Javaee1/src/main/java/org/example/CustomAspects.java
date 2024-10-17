package org.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
@Aspect
public class CustomAspects{


//    @Before("execution(public void com.example.UserServiceImpl.insert())")

    @Pointcut("execution(* org.example.UserServiceImpl.*())")
    public void pointcut(){}
//    @Before("execution(public void com.example.UserServiceImpl.*(..))")
    @Before("pointcut()")
    public void BeforeMethod(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature().getName()+"Before Method 被执行");
    }
////    public void BeforeMethod(){
////       System.out.println("Before Method 方法被执行");
////    }

    @Around("pointcut()")
    public Object adviseAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println(proceedingJoinPoint.getSignature().getName()
                + "环绕通知：执行前日志记录……");

        Object object = proceedingJoinPoint.proceed();
        System.out.println(proceedingJoinPoint.getSignature().getName()
                + "环绕通知：执行后日志记录……");
        return object;
    }



    @AfterThrowing(value = "pointcut()", throwing = "e")
    public void adviseThrow(JoinPoint joinPoint, Throwable e) {
        System.out.println(joinPoint.getSignature().getName() + "异常通知：" + e.getMessage());
    }

    @AfterReturning("pointcut()")
    public void adviseReturn(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature().getName() + "返回通知：释放资源……");
    }
}
