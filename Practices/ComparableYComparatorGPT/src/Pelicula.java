import java.util.Comparator;

public class Pelicula implements Comparator<Pelicula> {
    private String titulo;
    private double rating;
    int duracionMinutos;

    public Pelicula(String titulo, double rating, int duracionMinutos) {
        this.titulo = titulo;
        this.rating = rating;
        this.duracionMinutos = duracionMinutos;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getRating() {
        return rating;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public int compare(Pelicula p1, Pelicula p2) {
        int cmp = Double.compare(p1.getRating(), p2.getRating());
        if(cmp != 0) {
            return cmp;
        }
        cmp = Integer.compare(p1.getDuracionMinutos(), p2.getDuracionMinutos());
        return cmp;
        }
    }
}
