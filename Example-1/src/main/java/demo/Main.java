package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

//        Doctor doctor = new Doctor();
//        doctor.assist();

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

//        Doctor doctor = context.getBean(Doctor.class);
//        doctor.assist();
//
//        Nurse nurse = context.getBean(Nurse.class);
//        nurse.assist();

//        Staff staff = context.getBean(Doctor.class);
//        staff.assist();
//
//        Staff staff1= context.getBean(Doctor.class);
//        staff1.assist();

        Doctor doctor = context.getBean(Doctor.class);
        doctor.assist();
        System.out.println(doctor.getQualification());
    }
}
