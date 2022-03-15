
import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        Doctor myDoctor = new Doctor("Anna", "pediatria");

        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        myDoctor.addAvailableAppointment(new Date(), "16h");
        myDoctor.addAvailableAppointment(new Date(), "17h");
        myDoctor.addAvailableAppointment(new Date(), "18h");

        // System.out.println(myDoctor.getAvailableAppointments());
        

        for (Doctor.AvailableAppointment aA : myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }

        showMenu();

    }

}