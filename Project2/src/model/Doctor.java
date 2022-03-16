package model;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {

    /**
     * Atributos
     */
    private String speciality;

    public Doctor(String name, String email) {
        super(name, email);
        this.speciality = speciality;
        System.out.println("El nombre del Doctor asignado es: " + name +
                "\n El nombre de la especialidad es: " + speciality);

    }

    /**
     * Comportamientos
     */

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    public void addAvailableAppointment(Date date, String time) {
        availableAppointments.add(new Doctor.AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpeciality: " + speciality + "\nAvailable: " + availableAppointments.toString();
    }

    public static class AvailableAppointment {
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;

        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return "Available Apointments \n Date: " + date + "\n Time: " + time;
        }

    }

    @Override
    public void showDataUser() {
        System.out.println("Hospital: Creu Roja");
        System.out.println("Departament: Cancèr");
    }

}
