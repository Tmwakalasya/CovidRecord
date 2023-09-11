/**
 * @author 6399405
 * Title: Covid vaccine record:
 * Semester:    COP 2210 FALL 2023
 * Professor's Name: Prof. Charters and Prof.Niki
 * Description of program's Functionality:
 *              This program creates a covid vaccine record for 3 patients and shows their vaccine record
 *
 */
import java.util.Scanner;
public class CountyVaccinations {
    public static Scanner scnr = new Scanner(System.in);

    public static void main(String[] args){
        CoronaVaccineRecord record1 = createAVaccineRecord();
        Patient patient1 = CreateAPatient(record1);
        reportVaccination(patient1);
        CoronaVaccineRecord record2 = createAVaccineRecord();
        Patient patient2 = CreateAPatient(record2);
        reportVaccination(patient2);
        CoronaVaccineRecord record3 = createAVaccineRecord();
        Patient patient3 = CreateAPatient(record1);
        reportVaccination(patient3);

    }
    public static CoronaVaccineRecord createAVaccineRecord(){
        /**This method creates a vaccine record for a patient and asks for some information on vaccine name,date of shots,site
         * and the name of the manufacturer
         */
        String nameOfVaccine,manufacturer,fshot,sshot,bshot,siteofvaccination;
        System.out.println("What is the name of the vaccine: ");
        nameOfVaccine = scnr.nextLine();
        System.out.println("What is the name of the manufacturer: ");
        manufacturer = scnr.nextLine();
        System.out.println("What was the date of the first shot(mm/dd/yyyy): ");
        fshot = scnr.nextLine();
        System.out.println("What was the date of the second shot(mm/dd/yyyy): ");
        sshot = scnr.nextLine();
        System.out.println("What was the date of the booster shot(mm/dd/yyyy): ");
        bshot = scnr.nextLine();
        System.out.println("What was the site of the vaccination: ");
        siteofvaccination = scnr.nextLine();
        CoronaVaccineRecord vaccineRecord = new CoronaVaccineRecord(nameOfVaccine,manufacturer,fshot,sshot,bshot);
        return vaccineRecord;
    }
    public static Patient CreateAPatient(CoronaVaccineRecord vaccineRecord){
        /** Thus method creates a patient record and asks for their firstname,lastname and their date of birth.
         * and takes vaccineRecord as a parameter.
         */
        String firstname, lastname, dateofbirth;
        Scanner scnr = new Scanner(System.in);
        System.out.println("What is your first name: ");
        firstname = scnr.nextLine();
        System.out.println("What is your last name: ");
        lastname = scnr.nextLine();
        System.out.println("What was the date of birth(mm/dd/yyyy): ");
        dateofbirth= scnr.nextLine();
        return new Patient(firstname,lastname,dateofbirth,vaccineRecord);


    }

    public static void reportVaccination(Patient patient){
        /** This method gives the report of the of the vaccination of a patient and takes patient as a parameter
         */
        System.out.println("Here is the vaccination report for " + patient.getfName() + " " + patient.getlName() + " ");
        System.out.println(patient);
        System.out.println();

    }

}
