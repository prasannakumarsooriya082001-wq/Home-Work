
package PatientRecordSystem;


public class PatientRecord 
{
    private String patientName;
    private int age;
    private String disease;
    private String doctorName;
    private String roomType;
    private double billAmount;

    public PatientRecord() 
    {
        
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }
    
    void showDeatils()
    {
        System.out.println("Patient Name : "+patientName);
        System.out.println("Age : "+age);
        System.out.println("Disease : "+disease);
        System.out.println("Doctor Name : "+doctorName);
        System.out.println("Room Type : "+roomType);
        System.out.println("Bill Amount : "+billAmount);
    }
}
