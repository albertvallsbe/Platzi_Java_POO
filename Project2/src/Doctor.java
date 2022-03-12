public class Doctor {

    /**
     * Atributos
     */
    static int id = 0;// autoincrement
    String name;
    String email;
    String speciality;

    Doctor() {
        System.out.println("Construyendo el objeto doctor");
        Doctor.id++;
    }

    Doctor(String name, String speciality) {
        Doctor.id++;
        this.name = name;
        this.speciality = speciality;
        System.out.println("El nom del doctor: " + name + ", Especialitat: "+ speciality);
    }

    /**
     * Comportamientos
     */
    public void showName() {
        System.out.println(name);
    }

    public void showId(){
        System.out.println("ID Doctor: " + Doctor.id);
    }
}
