import java.util.Comparator;

public class ComparadorCompuesto implements Comparator<InversionSimple> {
    private Comparator<InversionSimple> comparador1;
    private Comparator<InversionSimple> comparador2;

    public ComparadorCompuesto(Comparator<InversionSimple> comparador1, Comparator<InversionSimple> comparador2) {
        this.comparador1 = comparador1;
        this.comparador2 = comparador2;
    }

    public int compare(InversionSimple o1, InversionSimple o2) {
        if(comparador1.compare(o1, o2) != 0) {
            return comparador1.compare(o1, o2);
        }
        return comparador2.compare(o1, o2);
    }
}
