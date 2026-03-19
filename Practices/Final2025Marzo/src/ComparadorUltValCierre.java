import java.util.Comparator;

public class ComparadorUltValCierre implements Comparator<InversionSimple> {
    public int compare(InversionSimple o1, InversionSimple o2) {
        return Double.compare(o1.getUltValCierre(), o2.getUltValCierre());
    }
}
