import java.util.ArrayList;
import java.util.Collections;

public class OficinaEnrolamiento {
    private ArrayList<Poni> ponisDisponibles;

    public OficinaEnrolamiento() {
        ponisDisponibles = new ArrayList<>();
    }

    public void agregarPoni(Poni poni) {
        ponisDisponibles.add(poni);
        Collections.sort(ponisDisponibles);
    }

    public ArrayList<Poni> getPonisDisponibles() {
        return new ArrayList<>(ponisDisponibles);
    }
}
