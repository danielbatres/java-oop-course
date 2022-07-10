import static ui.UIMenu.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // showMenu();

        Doctor myDoctor = new Doctor("Daniel", "Pediatria");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        System.out.println(myDoctor.getAvailableAppoiments());

        for (Doctor.AvailableAppoiment aA : myDoctor.getAvailableAppoiments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }

        Patient patient = new Patient("Alejandra", "alejandra@mail.com");
        System.out.println(patient);
    }
}