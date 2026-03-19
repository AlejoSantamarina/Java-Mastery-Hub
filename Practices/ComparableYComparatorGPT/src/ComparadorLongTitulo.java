import java.util.Comparator;

public class ComparadorLongTitulo implements Comparator<Pelicula> {

    public int compare(Pelicula p1, Pelicula p2) {
        return Integer.compare(p1.getTitulo().length(), p2.getTitulo().length());
    }
}
