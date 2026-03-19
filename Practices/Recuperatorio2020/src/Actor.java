import java.time.LocalDate;
import java.util.ArrayList;

public class Actor {
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private ArrayList<Pelicula> peliculasActuadas;

    public Actor(String nombre, String apellido, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        peliculasActuadas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public ArrayList<Pelicula> getPeliculasActuadas() {
        return peliculasActuadas;
    }

    public Actor getCopia() {
        Actor copia = new Actor(apellido, nombre, fechaNacimiento);
        copia.peliculasActuadas.addAll(new ArrayList<>(peliculasActuadas)); //Recordar.
        return copia;
    }
}
