public class Main {
    public static void main(String[] args) {
        /**
         * Instanciem, creem l'objecte amb el mètode constructor
         */
        Doctor myDoctor = new Doctor();
        Doctor myDoctor2 = new Doctor("Anna");

        myDoctor.name= "Albert";
        myDoctor.showName();
        myDoctor2.showName();

    }
}