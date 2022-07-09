public class Doctor {
    // Atributos
    int id;
    String name;
    String speciality;

    Doctor() {
        System.out.println("Construyendo el Objeto Doctor");
    }

    Doctor(String name) {
        System.out.println("El nombre del Doctor asignado es: " + name);
    }

    // Comportamientos, métodos
    public void showName() {
        System.out.println(name);
    }
}
