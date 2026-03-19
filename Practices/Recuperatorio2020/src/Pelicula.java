import java.util.ArrayList;

public class Pelicula extends ElemUn {
    private double puntaje;
    private int anio;
    private int oscars;
    private ArrayList<Actor> actores;

    public Pelicula(String titulo, double puntaje, int anio, int oscars) {
        super(titulo);
        this.puntaje = puntaje;
        this.anio = anio;
        this.oscars = oscars;
        actores = new ArrayList<>();
    }

    public double getPuntaje() {
        return puntaje;
    }

    public int getOscars() {
        return oscars;
    }

    public int getAnio() {
        return anio;
    }

    public ArrayList<Actor> getActores() {
        return actores;
    }

    public ElemUn getCopia(Condicion c) {
        if(c.cumple(this)) {
            Pelicula copia = new Pelicula(this.getTitulo(), this.getPuntaje(), this.getAnio(), this.getOscars());
            for(Actor actor : actores) {
                copia.actores.add(actor);
            }
            return copia;
        }
        return null;
    }

    public ArrayList<Pelicula> buscar(Condicion c) {
        ArrayList<Pelicula> pelicula = new ArrayList<>();
        if(c.cumple(this)) {
           pelicula.add(this);
        }
        return pelicula;
    }
}
