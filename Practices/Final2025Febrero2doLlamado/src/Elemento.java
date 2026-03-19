import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Elemento {
    private int id;
    private String descripcion;

    public Elemento(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public abstract double getValor();
    public abstract LocalDate getFechaDeCompra();

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public abstract ArrayList<Elemento> getElementosFiltrados(Filtro filtro);
    public abstract double getValorAlquiler(Calculador calculador);
}
