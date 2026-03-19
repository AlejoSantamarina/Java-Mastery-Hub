import java.util.ArrayList;

public class Destino extends ElemViaje {
    private String guia;
    private int dificultad;
    private double costoBase;

    public Destino(String nombre, String bioma, String guia, int dificultad, double costoBase) {
        super(nombre,bioma);
        this.guia = guia;
        this.dificultad = dificultad;
        this.costoBase = costoBase;
    }

    public double getCostoBase() {
        return costoBase;
    }

    public int getDificultad() {
        return dificultad;
    }

    public String getGuia() {
        return guia;
    }

    public ArrayList<Destino> getDestinosFiltrados(Filtro filtro) {
        ArrayList<Destino> destinos = new ArrayList<>();
        if(filtro.cumple(this)) {
            destinos.add(this);
        }
        return destinos;
    }
}
