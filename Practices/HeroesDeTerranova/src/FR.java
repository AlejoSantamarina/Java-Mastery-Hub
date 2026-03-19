import java.util.ArrayList;

public class FR extends Equipo {

    public FR(String nombre) {
        super(nombre);
        listaMiembros = new ArrayList<>();
    }

    public int getPoder() {
        int suma = 0;
        for(ElementoDefensa e : listaMiembros) {
            suma += e.getPoder();
        }
        return suma;
    }

    public double getVelocidad() {
        double max = 0;
        for(ElementoDefensa e : listaMiembros) {
            double velocidad = e.getVelocidad();
            if(velocidad > max) {
                max = velocidad;
            }
        }
        return max;
    }
}
