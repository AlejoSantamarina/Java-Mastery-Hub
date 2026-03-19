import java.time.LocalDate;
import java.util.ArrayList;

public abstract class ElementoUnidad {
    private String nombre;
    private String destino;
    private LocalDate fechaDePartida;
    private LocalDate fechaDeRegreso;

    public ElementoUnidad(String nombre, String destino, LocalDate fechaDePartida, LocalDate fechaDeRegreso) {
        this.nombre = nombre;
        this.destino = destino;
        this.fechaDePartida = fechaDePartida;
        this.fechaDeRegreso = fechaDeRegreso;
    }

    public abstract int getCantidadPersonas();
    public abstract Alumno getAlumnoMayorDeuda();
    public abstract ElementoUnidad getCopia();
    public abstract double getDeuda();
    public abstract double getPrecio();
    public abstract ArrayList<ElementoUnidad> buscar(Condicion c);

    public String getDestino() {
        return destino;
    }

    public LocalDate getFechaDePartida() {
        return fechaDePartida;
    }

    public LocalDate getFechaDeRegreso() {
        return fechaDeRegreso;
    }

    public String getNombre() {
        return nombre;
    }
}
