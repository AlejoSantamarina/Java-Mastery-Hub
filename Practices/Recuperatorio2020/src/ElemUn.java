import java.util.ArrayList;

public abstract class ElemUn {
    private String titulo;

    public ElemUn(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public abstract double getPuntaje();
    public abstract int getOscars();
    public abstract ArrayList<Actor> getActores();
    public abstract ElemUn getCopia(Condicion c);
    public abstract ArrayList<Pelicula> buscar(Condicion c);
}
