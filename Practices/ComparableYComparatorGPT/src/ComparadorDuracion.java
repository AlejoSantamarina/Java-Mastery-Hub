import java.util.Comparator;

public class ComparadorDuracion implements Comparator<Pelicula> {

    public int compare(Pelicula p1, Pelicula p2) {
        return Integer.compare(p1.getDuracionMinutos(), p2.getDuracionMinutos());
    }
}
