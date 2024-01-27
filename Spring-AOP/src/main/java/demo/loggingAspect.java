package demo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class loggingAspect {


    @Before("execution(* demo.ShoppingCart.checkout(..))")  // * means any return type
    public void beforeLogging(){                            // .. refers to the parameter
        System.out.println("Before Logging");
    }

    @After("execution(* *.*.checkout(..))")// * demo.ShoppingCart.checkout()
    public void afterLogging(){
        System.out.println("After Logging");
    }
}
