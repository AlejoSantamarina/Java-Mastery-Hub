import java.util.ArrayList;

public abstract class ElementoAnimal {
    private String nombre;

    public ElementoAnimal(String nombre) {
        this.nombre = nombre;
    }

    public abstract int getEnergia();
    public abstract double getAgilidad();
    public abstract ArrayList<String> getHabilidades();

    public String getNombre() {
        return nombre;
    }
}
