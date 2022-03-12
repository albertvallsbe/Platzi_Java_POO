public class Doctor {

    /**
     * Atributos
     */
    int id;
    String name;
    String speciality;

    Doctor() {
        System.out.println("Construyendo el objeto doctor");
    }

    Doctor(String name) {
        System.out.println("El nombre del doctor: " + name);
        this.name = name;
    }

    /**
     * Comportamientos
     */
    public void showName() {
        System.out.println(name);
    }
}
