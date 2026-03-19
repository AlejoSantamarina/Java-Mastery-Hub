import java.time.LocalDate;
import java.util.ArrayList;

public class Contingente extends ElementoUnidad {
    protected ArrayList<ElementoUnidad> elementos;

    public Contingente(String nombre, String destino, LocalDate fechaDePartida, LocalDate fechaDeRegreso) {
        super(nombre, destino, fechaDePartida, fechaDeRegreso);
        elementos = new ArrayList<>();
    }

    public void addElemento(ElementoUnidad elemento) {
        if(elementos.isEmpty() || (elementos.get(0).getDestino().equals(elemento.getDestino()) && elementos.get(0).getFechaDePartida().equals(elemento.getFechaDePartida()))) {
            if(!elementos.contains(elemento)) {
                elementos.add(elemento);
            }
        }
    }

    public int getCantidadPersonas() {
        int cantidad = 0;
        for(ElementoUnidad elemento : elementos) {
            cantidad += elemento.getCantidadPersonas();
        }
        return cantidad;
    }

    public Alumno getAlumnoMayorDeuda() {
        Alumno alumnoMayorDeuda = null;
        for(ElementoUnidad elemento : elementos) {
            Alumno nuevoAlumno = elemento.getAlumnoMayorDeuda();
            if(alumnoMayorDeuda == null || nuevoAlumno.getDeuda() > alumnoMayorDeuda.getDeuda()) {
                alumnoMayorDeuda = nuevoAlumno;
            }
        }
        if(alumnoMayorDeuda == null) {
            return null;
        }
        return alumnoMayorDeuda;
    }

    public Contingente getCopia() {
        Contingente contingenteCopia = new Contingente(getNombre(), getDestino(), getFechaDePartida(), getFechaDeRegreso());
        for(ElementoUnidad elemento : elementos) {
            ElementoUnidad elementoCopia = elemento.getCopia();
            contingenteCopia.addElemento(elementoCopia);
        }
        return contingenteCopia;
    }

    public double getDeuda() {
        double deuda = 0;
        for(ElementoUnidad elemento : elementos) {
            deuda += elemento.getDeuda();
        }
        return deuda;
    }

    public double getPrecio() {
        double precio = 0;
        for(ElementoUnidad elemento : elementos) {
            precio += elemento.getPrecio();
        }
        return precio;
    }

    public ArrayList<ElementoUnidad> buscar(Condicion c) {
        ArrayList<ElementoUnidad> elementosBusqueda = new ArrayList<>();
        if(c.cumple(this)) {
            elementosBusqueda.add(this);
            return elementosBusqueda;
        }
        for(ElementoUnidad elemento : elementos) {
            ArrayList<ElementoUnidad> elementosBusquedaAux = elemento.buscar(c);
            if(elementosBusquedaAux != null) {
                elementosBusqueda.addAll(elementosBusquedaAux);
            }
        }
        return elementosBusqueda;
    }
}
