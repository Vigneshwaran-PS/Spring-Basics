package demo;

import org.springframework.stereotype.Component;

@Component
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
