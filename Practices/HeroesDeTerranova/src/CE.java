import java.util.ArrayList;

public class CE extends Equipo {

    public CE(String nombre) {
        super(nombre);
        listaMiembros = new ArrayList<>();
    }

    public int getPoder() {
        int max = 0;
        for(ElementoDefensa e : listaMiembros) {
            int poder = e.getPoder();
            if(poder > max) {
                max = poder;
            }
        }
        return max;
    }

    public double getVelocidad() {
        if(!listaMiembros.isEmpty()) {
            return listaMiembros.get(0).getVelocidad();
        }
        return 0;
    }
}
