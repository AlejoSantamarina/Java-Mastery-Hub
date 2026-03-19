import java.util.ArrayList;

public class SagaSponsoreada extends Saga {
    private Pelicula peliculaExtra;

    public SagaSponsoreada(String titulo, Pelicula pelicula) {
        super(titulo);
        this.peliculaExtra = pelicula;
    }

    public Pelicula getPeliculaExtra() {
        return peliculaExtra;
    }

    public ArrayList<Pelicula> buscar(Condicion c) {
        ArrayList<Pelicula> peliculas = new ArrayList<>();
        peliculas.add(peliculaExtra);
        for(ElemUn elem : elementos) {
            ArrayList<Pelicula> pelis = elem.buscar(c);
            if(!pelis.isEmpty()) {
                peliculas.addAll(pelis);
            }
        }
        return peliculas;
    }
}
