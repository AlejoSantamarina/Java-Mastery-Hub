import java.util.Comparator;

public class ComparadorNombre implements Comparator<Animal> {
    public int compare(Animal a1, Animal a2) {
        return a1.getNombre().compareTo(a2.getNombre());
    }
}
