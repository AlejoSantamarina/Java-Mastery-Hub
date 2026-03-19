import java.util.Comparator;

public class ComparadorRating implements Comparator<Pelicula> {

    public int compare(Pelicula p1, Pelicula p2) {
        return Double.compare(p1.getRating(), p2.getRating());
    }
}
