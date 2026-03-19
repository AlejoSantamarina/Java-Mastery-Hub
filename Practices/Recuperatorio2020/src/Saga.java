import java.util.ArrayList;

public class Saga extends ElemUn {
    protected ArrayList<ElemUn> elementos;

    public Saga(String titulo) {
        super(titulo);
        elementos = new ArrayList<>();
    }

    public double getPuntaje() {
        double puntajeTotal = 0;
        for (ElemUn elem : elementos) {
            puntajeTotal += elem.getPuntaje();
        }
        if(elementos.size() > 0) {
            return puntajeTotal / elementos.size();
        }
        return 0;
    }

    public int getOscars() {
        int oscars = 0;
        for (ElemUn elem : elementos) {
            oscars += elem.getOscars();
        }
        return oscars;
    }

    public ArrayList<Actor> getActores() {
        ArrayList<Actor> actores = new ArrayList<>();
        for (ElemUn elem : elementos) {
            for(Actor actor : elem.getActores()) {
                if(!actores.contains(actor)) {
                    actores.add(actor);
                }
            }
        }
        return actores;
    }

    public ElemUn getCopia(Condicion c) {
        Saga copia = new Saga(this.getTitulo());
        for(ElemUn elem : elementos) {
            ElemUn copiaElem = elem.getCopia(c);
            if(copiaElem != null) {
                copia.elementos.add(copiaElem);
            }
        }
        if(!copia.elementos.isEmpty()) {
            return copia;
        }
        return null;
    }

    public ArrayList<Pelicula> buscar(Condicion c) {
        ArrayList<Pelicula> peliculas = new ArrayList<>();
        for(ElemUn elem : elementos) {
            ArrayList<Pelicula> pelis = elem.buscar(c);
            if(!pelis.isEmpty()) {
                peliculas.addAll(pelis);
            }
        }
        return peliculas;
    }
}