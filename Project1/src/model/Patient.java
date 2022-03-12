package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Albert
 */
public class Patient extends User {
    //Atributs

    private String birthday;
    private double weight;
    private double height;
    private String blood;
    
    private ArrayList<AppointmentDoctor> appointmentDoctors = new ArrayList<>();
    private ArrayList<AppointmentNurse> appointmentNurses = new ArrayList<>();

    public ArrayList<AppointmentDoctor> getAppointmentDoctors() {
        return appointmentDoctors;
    }

    public void addAppointmentDoctors(Doctor doctor, Date date, String time) {
        AppointmentDoctor appointmentDoctor= new AppointmentDoctor(this, doctor);
        appointmentDoctor.schedule(date, time);
        appointmentDoctors.add(appointmentDoctor);
    }

    public ArrayList<AppointmentNurse> getAppointmentNurses() {
        return appointmentNurses;
    }

    public void setAppointmentNurses(ArrayList<AppointmentNurse> appointmentNurses) {
        this.appointmentNurses = appointmentNurses;
    }

    // Constructor
    public Patient(String name, String email) {
        super(name, email);
        //this.name = name;
        //this.email = email;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getWeight() {
        return this.weight + "Kg";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getHeight() {
        return this.height + "M";
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Age: " + birthday + "\n Weight: " + getWeight() + "\n Height: " + getHeight() + "\n Blood: " + blood;
        //return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showDataUser() {
        System.out.println("Pacient");
        System.out.println("Pacient");
    }
}
