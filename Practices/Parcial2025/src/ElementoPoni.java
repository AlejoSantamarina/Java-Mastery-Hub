import java.util.ArrayList;

public abstract class ElementoPoni {
    protected String nombre;

    public ElementoPoni(String nombre) {
        this.nombre = nombre;
    }

    public abstract int getPoderMagico();
    public abstract double getVelocidad();
    public abstract ArrayList<String> getHabilidades();
    public abstract int getCantidad(Filtro f);
}
