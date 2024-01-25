package demo;
import org.springframework.stereotype.Component;

@Component  // when we annotate class as @Component , spring will handle that instance of object (bean) by creating it into spring container
public class Doctor {
    public void assist(){
        System.out.println("Doctor is Assisting");
    }
}
