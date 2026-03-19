import java.util.ArrayList;

public abstract class ElementoDefensa {
    private String nombre;

    public ElementoDefensa(String nombre) {
        this.nombre = nombre;
    }

    public abstract int getPoder();
    public abstract double getVelocidad();
    public abstract ArrayList<String> getListaHabilidades();
}
