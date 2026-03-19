import java.util.ArrayList;

public class UCI extends UnidadDeTrabajo {

    public UCI(String nombre) {
        super(nombre);
    }

    public int getNivelExperiencia() {
        int nivelExperiencia = 0;
        for(Unidad u : unidades) {
            nivelExperiencia += u.getNivelExperiencia();
        }
        return nivelExperiencia;
    }

    public double getPrecisionEnCampo() {
        double total = 0;
        double cantidad = 0;
        for(Unidad u : unidades) {
            total += u.getPrecisionEnCampo();
            cantidad ++;
        }
        return total/cantidad;
    }

    public UnidadDeTrabajo crearInstancia() {
        return new UCI(getNombre());
    }
}
