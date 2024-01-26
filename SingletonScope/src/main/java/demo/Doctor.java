package demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Doctor {
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
