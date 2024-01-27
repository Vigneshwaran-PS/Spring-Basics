package demo;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

@Component
public class Doctor implements BeanNameAware {
    @Override
    public void setBeanName(String name) {
        System.out.println("Set Bean name method is called");
    }

    private String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void assist(){
        System.out.println("Doctor is Assisting");
    }

    @PostConstruct
    public void postContruct(){
        System.out.println("Post constructor method is called");
    }
}
