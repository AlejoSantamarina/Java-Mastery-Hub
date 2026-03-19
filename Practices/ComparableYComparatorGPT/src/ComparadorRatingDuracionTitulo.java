import java.util.Comparator;

public class ComparadorRatingDuracionTitulo implements Comparator<Pelicula> {

    public int compare(Pelicula p1, Pelicula p2) {
        int cmp = Double.compare(p1.getRating(), p2.getRating());
        if(cmp != 0) return cmp;

        cmp = Integer.compare(p1.getDuracionMinutos(), p2.getDuracionMinutos());
        if(cmp != 0) return cmp;

        cmp = Integer.compare(p1.getTitulo().length(), p2.getTitulo().length());
        if(cmp != 0) return cmp;

        return p1.getTitulo().compareTo(p2.getTitulo());
    }
}
