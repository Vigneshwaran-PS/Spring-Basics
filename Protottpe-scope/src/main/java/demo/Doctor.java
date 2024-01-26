package demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



@Component
@Scope(scopeName = "prototype")
public class Doctor {
    private String qualification;

    @Override
    public String toString() {
        return "Doctor{" +
                "qualification='" + qualification + '\'' +
                '}';
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
}
