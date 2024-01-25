package demo;

public class Doctor {
    private String qualification;

    Doctor(String qualification){
        this.qualification=qualification;
    }
    public String getQualification() {
        return qualification;
    }


    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void assist(){
        System.out.println("Doctor is Assisting");
    }
}
