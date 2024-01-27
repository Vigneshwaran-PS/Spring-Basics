package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.print.Doc;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Beancongif.class);

        Doctor doctor = context.getBean(Doctor.class);
        doctor.setQulaification("MBBS");
        System.out.println(doctor);
        Doctor doctor1 = context.getBean(Doctor.class);
        System.out.println(doctor1);

        //output
//        From Doctor Constructor
//        Doctor{qulaification='MBBS'}
//        Doctor{qulaification='MBBS'}

        //Here the constructor is executed only once because spring follows singleton scope
        //Both of the object qualificaton is assigned as MBBS


        // Singleton scope means spring create only one object for the class
        // if we try to create multiple class is wont consider .
    }
}
