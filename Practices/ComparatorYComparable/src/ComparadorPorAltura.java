import java.util.Comparator;

public class ComparadorPorAltura implements Comparator<Persona> {
    public int compare(Persona o1, Persona o2) {
        return Double.compare(o2.getAltura(), o1.getAltura());
    }
}
