import java.util.ArrayList;

public abstract class ElemViaje {
    private String nombre;
    private String bioma;

    public ElemViaje(String nombre, String bioma) {
        this.nombre = nombre;
        this.bioma = bioma;
    }

    public String getNombre() {
        return nombre;
    }

    public String getBioma() {
        return bioma;
    }

    public abstract double getCostoBase();
    public abstract int getDificultad();
    public abstract ArrayList<Destino> getDestinosFiltrados(Filtro filtro);
}
