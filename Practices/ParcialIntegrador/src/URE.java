import java.util.ArrayList;

public class URE extends UnidadDeTrabajo {

    public URE(String nombre) {
        super(nombre);
    }

    public int getNivelExperiencia() {
        int max = 0;
        for(Unidad u : unidades) {
            int actual = u.getNivelExperiencia();
            if(actual > max) {
                max = actual;
            }
        }
        return max;
    }

    public double getPrecisionEnCampo() {
        if(unidades.isEmpty()) return 0;
        return unidades.get(unidades.size() - 1).getPrecisionEnCampo();
    }

    public UnidadDeTrabajo crearInstancia() {
        return new UCI(getNombre());
    }
}
