import java.util.ArrayList;
import java.util.Collections;

public class RegistroNacional {
    private ArrayList<Investigador> investigadores;

    public RegistroNacional() {
        investigadores = new ArrayList<>();
    }

    public void agregarInvestigador(Investigador investigador) {
        Collections.sort(investigadores);
    }

    public ArrayList<Investigador> getInvestigadores() {
        return investigadores;
    }
}
