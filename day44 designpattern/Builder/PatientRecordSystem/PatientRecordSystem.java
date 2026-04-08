
package PatientRecordSystem;



public class PatientRecordSystem {

    public static void main(String[] args) 
    {
        PatientRecordBuilder prb = new PatientRecordBuilder();
        PatientRecord pr = prb.
                setPatientName("Prasanna").
                setAge(24).
                setDisease("Fever").
                setdoctorName("Kumar").
                setRoomType("Single").
                setBillAmount(500).
                build();
        
        pr.showDeatils();
    }
    
}
