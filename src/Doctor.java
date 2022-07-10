import java.beans.beancontext.BeanContextServiceAvailableEvent;
import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    // Atributos
    static int id = 0; // Autoincrementa
    private String name;
    private String email;
    private String speciality;

    Doctor() {
        System.out.println("Construyendo el Objeto Doctor");
    }

    Doctor(String name, String speciality) {
        System.out.println("El nombre del Doctor asignado es: " + name);
        id++;
        this.name = name;
        this.speciality = speciality;
    }

    // Comportamientos, métodos
    public void showName() {
        System.out.println(name);
    }

    public void showId() {
        System.out.println("ID Doctor: " + id);
    }

    ArrayList<AvailableAppoiment> availableAppoiments = new ArrayList<>();

    public void addAvailableAppointment(Date date, String time) {
        availableAppoiments.add(new Doctor.AvailableAppoiment(date, time));
    }

    public ArrayList<AvailableAppoiment> getAvailableAppoiments() {
        return availableAppoiments;
    }

    public static class AvailableAppoiment {
        private int id_availableAppoinment;
        private Date date;
        private String time;

        AvailableAppoiment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId_availableAppoinment() {
            return id_availableAppoinment;
        }

        public void setId_availableAppoinment(int id_availableAppoinment) {
            this.id_availableAppoinment = id_availableAppoinment;
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
    }
}
