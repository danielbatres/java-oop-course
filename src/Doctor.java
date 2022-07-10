import java.beans.beancontext.BeanContextServiceAvailableEvent;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    private String speciality;

    Doctor(String name, String email) {
        super(name, email);
        System.out.println("El nombre del Doctor asignado es: " + name);
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
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
