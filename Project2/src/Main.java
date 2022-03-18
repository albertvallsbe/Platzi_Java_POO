/*
import java.util.Date;

import model.Doctor;
import model.Patient;
import model.User;
*/
import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        //Doctor myDoctor = new Doctor("Anna", "ann@ann.code");
        //Patient myPatient = new Patient("Joan", "joanet@email.ca");
/*
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        myDoctor.addAvailableAppointment(new Date(), "16h");
        myDoctor.addAvailableAppointment(new Date(), "17h");
        myDoctor.addAvailableAppointment(new Date(), "18h");
*/
        // System.out.println(myDoctor.getAvailableAppointments());
/*
        for (Doctor.AvailableAppointment aA : myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }
        */

        /*
        System.out.println(myDoctor);
        System.out.println("\n");
        System.out.println(myPatient);

        User user = new Doctor("Albert", "a@a.com");
        user.showDataUser();

         User user1 = new User("Albert", "a@a.com"){
             @Override
             public void showDataUser(){
                 System.out.println("Doctor");
                 System.out.println("Hospital Verde");
             }
         };

         user1.showDataUser();
*/
        showMenu();

    }

}