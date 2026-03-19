import java.util.Comparator;

public class ComparadorNombre implements Comparator<InversionSimple> {
    public int compare(InversionSimple o1, InversionSimple o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }
}
