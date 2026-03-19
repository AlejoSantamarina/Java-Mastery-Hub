import java.time.LocalDate;
import java.util.ArrayList;

public class Alumno extends ElementoUnidad {
    private double deuda;
    private double precio;

    public Alumno(String nombre, String destino, LocalDate fechaDePartida, LocalDate fechaDeRegreso, double deuda, double precio) {
        super(nombre, destino, fechaDePartida, fechaDeRegreso);
        this.deuda = deuda;
        this.precio = precio;
    }

    public int getCantidadPersonas() {
        return 1;
    }

    public Alumno getAlumnoMayorDeuda() {
        return this;
    }

    public double getDeuda() {
        return deuda;
    }

    public double getPrecio() {
        return precio;
    }

    public Alumno getCopia() {
        Alumno alumnoCopia = new Alumno(getNombre(), getDestino(), getFechaDePartida(), getFechaDeRegreso(), getDeuda(), getPrecio());
        return alumnoCopia;
    }

    public ArrayList<ElementoUnidad> buscar(Condicion c) {
        ArrayList<ElementoUnidad> alumno = new ArrayList();
        if(c.cumple(this)) {
            alumno.add(this);
        }
        return alumno;
    }
}
