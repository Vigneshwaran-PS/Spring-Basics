package demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class Doctor {

    Doctor(){
        System.out.println("From Doctor Constructor");
    }

    private String qulaification;

    @Override
    public String toString() {
        return "Doctor{" +
                "qulaification='" + qulaification + '\'' +
                '}';
    }

    public String getQulaification() {
        return qulaification;
    }

    public void setQulaification(String qulaification) {
        this.qulaification = qulaification;
    }
}
