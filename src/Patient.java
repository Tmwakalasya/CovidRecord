public class Patient {
    private String fName;
    private String lName;

    private String dateOfBirth;

    private CoronaVaccineRecord vaccineRecord;
    //  Code below represents the constructor:
    public Patient(String fName, String lName, String dateOfBirth,CoronaVaccineRecord vaccineRecord){
        this.fName = fName;
        this.lName = lName;
        this.dateOfBirth = dateOfBirth;
        this.vaccineRecord = vaccineRecord;

    }
// Below we have the setters and getters:
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    public String toString() {

        return " firstName: " + fName + " lastName: " + lName + " dateOfBirth: " + dateOfBirth + " " + vaccineRecord;


    }
}
