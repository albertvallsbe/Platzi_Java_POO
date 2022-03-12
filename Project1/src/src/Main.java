package src;

import model.Patient;
import model.Doctor;
import java.util.Date;
import model.AppointmentDoctor;
import model.ISchedulable;
import model.User;
import static ui.UIMenu.*;

public class Main {

    public static void main(String[] args) {

//        /** 
//         * Creem/instanciem un objecte <mydoctor> de la clase <Doctor> amb el constructor <Doctor()>
//         */
//        Doctor myDoctor = new Doctor();
//        /**
//         * Assignem un nom al objecte, accedim als atributs i als métodes amb la sintaxis <.>
//         */
//        myDoctor.name = "Alex Rodríguez";
//        myDoctor.showName();
//        myDoctor.showId();
//        //System.out.println(Doctor.id);
//        
//        Doctor myDoctorAnn = new Doctor();
//        myDoctor.showId();
//        //System.out.println(Doctor.id);
        /**
         * Doctor myDoctor = new Doctor("Anahí", "Pediatra");
         * System.out.println(myDoctor.name);
         * System.out.println(myDoctor.speciality); Patient patient = new
         * Patient("Alexandra", "alex@email.com");
         * System.out.println(patient.name); System.out.println(patient.email);
         *
         * patient.weight = 60.5; patient.height = 1.63;
         *
         * System.out.println(patient.weight);
         * System.out.println(patient.height);
         */
        // ui.UIMenu.showMenu();
        //Classe 15!
//        Doctor myDoctor = new Doctor("Anahí Salgado", "Pediatria");
//        myDoctor.addAvailableAppointment(new Date(), "10pm");
//        myDoctor.addAvailableAppointment(new Date(), "12pm");
//        
//        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
//            System.out.println(aA.getDate() + "  " + aA.getTime());
//        }
//        
        //Classe 21!
//        Patient patient = new Patient("Alexandra", "alex@email.com");
//        System.out.println(patient);
//        System.out.println(myDoctor);
//
//        System.out.println("--------------");
//        User user = new Doctor("pep", "prova");
//        user.showDataUser();
//        System.out.println("--------------");
//
//        User userP = new Patient("pep", "prova");
//        userP.showDataUser();
//        System.out.println("--------------");
//
//        User user1 = new User("Albert", "provaaaa") {
//            @Override
//            public void showDataUser() {
//                System.out.println("Doctor ");
//                System.out.println("Hospital: Tarragona");
//            }
//        };
//        user1.showDataUser();
//
//        ISchedulable iSchedulable = new ISchedulable() {
//            @Override
//            public void shcedulable(Date date, String time) {
//
//            }
//        };
//         ISchedulable schedulable1 = new AppointmentDoctor();
//         iSchedulable.shcedulable(new Date(), "13pm");
         
        showMenu();
    }
}
