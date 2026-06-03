
package PatientRecordSystem;


public class PatientRecordBuilder 
{
    private PatientRecord pr;

    public PatientRecordBuilder() 
    {
        pr = new PatientRecord();
    }
    
    public PatientRecordBuilder setPatientName(String patientName)
    {
        this.pr.setPatientName(patientName);
        return this;
    }
    
    public PatientRecordBuilder setAge(int age)
    {
        this.pr.setAge(age);
        return this;
    }
    
    public PatientRecordBuilder setDisease(String disease)
    {
        this.pr.setDisease(disease);
        return this;
    }
    
    public PatientRecordBuilder setdoctorName(String doctorName)
    {
        this.pr.setDoctorName(doctorName);
        return this;
    }
    
    public PatientRecordBuilder setRoomType(String roomType)
    {
        this.pr.setRoomType(roomType);
        return this;
    }
    
    public PatientRecordBuilder setBillAmount(double billAmount)
    {
        this.pr.setBillAmount(billAmount);
        return this;
    }
    
    public PatientRecord build()
    {
        return pr;
    }
    
    
}
