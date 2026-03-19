import java.util.Comparator;

public class ComparadorEnergia implements Comparator<Animal> {
    public int compare(Animal a1, Animal a2) {
        return a1.getEnergia() - a2.getEnergia();
    }
}
