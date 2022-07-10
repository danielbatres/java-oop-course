import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        // showMenu();

        Doctor myDoctor = new Doctor("Daniel", "Pediatria");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        int i = 0;
        int b = 2;
        b = i; // b = 0
        String name = "Daniel";

        Patient patient = new Patient("Alejandra", "alejandra@mail.com");
        Patient patient2 = new Patient("Anahi", "anahi@mail.com");

        System.out.println(patient.getName());
        System.out.println(patient2.getName());
        patient2 = patient;

        System.out.println(patient.getName());
        System.out.println(patient2.getName());

        patient.setWeight(54.5);
        System.out.println(patient.getWeight());

        patient2.setName("Manuel"); // también afectara a patient
        System.out.println(patient.getName());
        System.out.println(patient2.getName());

        patient.setPhoneNumber("12345678");
        System.out.println(patient.getPhoneNumber());
    }
}