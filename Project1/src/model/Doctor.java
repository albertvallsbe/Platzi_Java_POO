package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Albert
 */
public class Doctor extends User {

    private String speciality;
    private ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    public Doctor(String name, String email) {
        super(name, email);
//        System.out.println("El nom del Doctor es: " + name);
//        this.speciality = speciality; //True??????????
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    /**
     * Modificació dels Constructors per default
     */
//    Doctor() {
//        
//        System.out.println("Construint l'objecte Doctor");
//
//    }
    //comportamientos
//    public void showName() {
//        System.out.println(name);
//    }
//
//    public void showId() {
//        System.out.println("Id Doctor: " + Doctor.id);
//    }
    

    public void addAvailableAppointment(String date, String time) {
        availableAppointments.add(new Doctor.AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Speciality: " + speciality + "\n Available: " + availableAppointments.toString();
        //return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showDataUser() {
        System.out.println("Hospital: Terrassa");
    }

    public static class AvailableAppointment {

        private int id;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");

        public AvailableAppointment(String date, String time) {
            try {
                this.date = format.parse(date);
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
        
        
        //sobrecarga de metodo
        public Date getDate(String DATE) {
            return date;
        }
        
        public String getDate() {
            return format.format(date); 
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
            return "Available Appointments \n Date: " + date + " \n Time: " + time;
            //return super.toString(); //To change body of generated methods, choose Tools | Templates.
        }

    }

}
