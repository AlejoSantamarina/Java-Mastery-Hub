import java.util.Comparator;

public class ComparadorCantHabilidades implements Comparator<Animal> {
    public int compare(Animal a1, Animal a2) {
        return a1.getHabilidades().size() - a2.getHabilidades().size();
    }
}
