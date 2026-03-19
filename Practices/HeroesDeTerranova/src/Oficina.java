import java.util.ArrayList;
import java.util.Collections;

public class Oficina {
    private ArrayList<Heroe> listaHeroes;

    public Oficina() {
        listaHeroes = new ArrayList<>();
    }

    public void agregarHeroe(Heroe h) {
        listaHeroes.add(h);
        Collections.sort(listaHeroes);
    }
}
