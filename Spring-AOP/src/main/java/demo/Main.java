package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        ShoppingCart sc = context.getBean(ShoppingCart.class);
        sc.checkout("user is Logging");
    }
}
