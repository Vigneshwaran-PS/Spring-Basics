package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanCongif.class);

        Doctor doctor = context.getBean(Doctor.class);
        doctor.setQulaification("MBBS");
        System.out.println(doctor);

        Doctor doctor1 = context.getBean(Doctor.class);
        System.out.println(doctor1);


        // output

        // From Doctor Constructor
        // Doctor{qulaification='MBBS'}
        // From Doctor Constructor
        // Doctor{qulaification='null'}


        //Here the contructor is executed twice as defined
        //for the reference doctor , the qualifiaction is MBBS
        //for the reference doctor1 , the qualification is null because no value is assigned to the qulaification
    }
}
