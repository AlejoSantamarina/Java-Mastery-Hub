import java.util.Comparator;

public class ComparadorVariacion implements Comparator<InversionSimple> {
    public int compare(InversionSimple o1, InversionSimple o2) {
        return Double.compare(o1.getVariacion(), o2.getVariacion());
    }
}
