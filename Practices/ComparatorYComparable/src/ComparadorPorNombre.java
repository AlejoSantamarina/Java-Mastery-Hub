import java.util.Comparator;

public class ComparadorPorNombre implements Comparator<Persona> {
    public int compare(Persona o1, Persona o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }
}
