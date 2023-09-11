public class CoronaVaccineRecord {
    private String nameOfVaccine;
    private String dateOfFirstShot;

    private String dateOfSecondShot;

    private String dateOfBoosterShot;

    private String vaccinationSite;
// The line below initializes the private variables that we have above
    public  CoronaVaccineRecord(String nameOfVaccine,
                                String dateOfFirstShot,
                                String dateOfSecondShot,
                                String dateOfBoosterShot,
                                String vaccinationSite){
        this.nameOfVaccine = nameOfVaccine;
        this.dateOfFirstShot = dateOfFirstShot;
        this.dateOfSecondShot = dateOfSecondShot;
        this.dateOfBoosterShot = dateOfBoosterShot;
        this.vaccinationSite = vaccinationSite;

    }
// These are the getters and setters
    public String getNameOfVaccine() {
        return nameOfVaccine;
    }

    public void setNameOfVaccine(String nameOfVaccine) {
        this.nameOfVaccine = nameOfVaccine;
    }

    public String getDateOfFirstShot() {
        return dateOfFirstShot;
    }

    public void setDateOfFirstShot(String dateOfFirstShot) {
        this.dateOfFirstShot = dateOfFirstShot;
    }

    public String getDateOfSecondShot() {
        return dateOfSecondShot;
    }

    public void setDateOfSecondShot(String dateOfSecondShot) {
        this.dateOfSecondShot = dateOfSecondShot;
    }

    public String getDateOfBoosterShot() {
        return dateOfBoosterShot;
    }

    public void setDateOfBoosterShot(String dateOfBoosterShot) {
        this.dateOfBoosterShot = dateOfBoosterShot;
    }

    public String getVaccinationSite() {
        return vaccinationSite;
    }

    public void setVaccinationSite(String vaccinationSite) {
        this.vaccinationSite = vaccinationSite;
    }
// toString concatenates the output:

    public String toString() {

        return "nameOfVaccine: " + nameOfVaccine + " dateOfFirstShot: "
                + dateOfFirstShot + " dateOfSecondShot: " + " DateOfBoosterShot: " + dateOfBoosterShot
                + " VaccinationSite: " + vaccinationSite;
    }
}
