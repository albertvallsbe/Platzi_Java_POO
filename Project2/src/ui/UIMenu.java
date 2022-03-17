package ui;

import model.Doctor;
import model.Patient;

import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {

    public static final String[] MONTHS_LIST = { "Gener", "Febrer", "Març", "Abril", "Maig", "Juny",
            "Juliol", "Agost", "Setembre", "Octubre", "Novembre", "Desembre" };

    public static Doctor doctorLogged;
    public static Patient patientLogged;

    public static void showMenu() {
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            Scanner in = new Scanner(System.in);
            response = Integer.valueOf(in.nextLine());

            switch (response) {
                case 1:
                    System.out.println("Doctor");
                    response = 0;
                    authUser(1);
                    break;
                case 2:
                    System.out.println("Patient");
                    response = 0;
                    authUser(2);
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        } while (response != 0);
    }

    private static void authUser(int userType) {

        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Alejandro", "ale@mail.com"));
        doctors.add(new Doctor("Maria", "mari@mail.com"));
        doctors.add(new Doctor("Alba", "alba@mail.com"));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Anna", "ann@mail.com"));
        patients.add(new Patient("Marta", "marti@mail.com"));
        patients.add(new Patient("Joan", "joan@mail.com"));

        boolean emailCorrect = false;
        do {

            System.out.println("Insert your email: a@a.com");
            Scanner in = new Scanner(System.in);
            String email = in.nextLine();

            if (userType == 1) {
                for (Doctor d : doctors) {
                    if (d.getEmail().equals(email)) {
                        emailCorrect = true;
                        // obtener el usuario logeado
                        doctorLogged = d;
                        // show doctor menu
                    }
                }
            }
            if (userType == 2) {
                for (Patient p : patients) {
                    if (p.getEmail().equals(email)) {
                        emailCorrect = true;
                        // obtener el usuario logeado
                        patientLogged = p;
                        // show patient menu
                    }
                }
            }

        } while (!emailCorrect);
    }

    public static void showPatientMenu() {
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner in = new Scanner(System.in);
            response = Integer.valueOf(in.nextLine());

            switch (response) {
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 0; i < 3; i++) {
                        System.out.println(i + ". " + MONTHS_LIST[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        } while (response != 0);
    }

}