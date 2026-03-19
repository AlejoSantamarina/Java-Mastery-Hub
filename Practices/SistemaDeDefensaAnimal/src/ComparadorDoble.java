import java.util.Comparator;

public class ComparadorDoble implements Comparator<Animal> {
    private Comparator<Animal> comparador1;
    private Comparator<Animal> comparador2;

    public int compare(Animal a1, Animal a2) {
        if(comparador1.compare(a1, a2) == 0) {
            return comparador2.compare(a1, a2);
        } else {
            return comparador1.compare(a1, a2);
        }
    }
}
