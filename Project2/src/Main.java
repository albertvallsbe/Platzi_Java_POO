import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        
        
        /**
         * Instanciem, creem l'objecte amb el mètode constructor
         */

        Doctor myDoctor = new Doctor();

        myDoctor.name = "Anna";
        myDoctor.showName();
        myDoctor.showId();
        Doctor myDoctorTitu = new Doctor("Albert", "dentist");
        myDoctorTitu.showName();
        myDoctorTitu.showId();

        

        showMenu();

    }

}