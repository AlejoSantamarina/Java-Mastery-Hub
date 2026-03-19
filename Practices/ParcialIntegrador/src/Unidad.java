import java.util.ArrayList;

public abstract class Unidad {
    private String nombre;

    public Unidad(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract int getNivelExperiencia();
    public abstract double getPrecisionEnCampo();
    public abstract ArrayList<String> getEspecializaciones();
    public abstract Unidad copiarSiCumple(Condicion c);
}
