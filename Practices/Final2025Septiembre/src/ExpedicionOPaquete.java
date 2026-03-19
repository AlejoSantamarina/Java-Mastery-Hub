import java.util.ArrayList;

public class ExpedicionOPaquete extends ElemViaje {
    public ArrayList<ElemViaje> destinos;
    private double descuento;

    public ExpedicionOPaquete(String nombre, String bioma, double descuento) {
        super(nombre, bioma);
        destinos = new ArrayList<>();
        this.descuento = descuento;
    }

    public double getCostoBase() {
        double costoBase = 0;
        for(ElemViaje elem : destinos) {
            costoBase += elem.getCostoBase();
        }
        return costoBase - costoBase*descuento;
    }

    public int getDificultad() {
        int dificultad = 0;
        for(ElemViaje elem : destinos) {
            dificultad += elem.getDificultad();
        }
        return dificultad;
    }

    public ArrayList<Destino> getDestinosFiltrados(Filtro filtro) {
        ArrayList<Destino> destinos = new ArrayList<>();
        for(ElemViaje elem : destinos) {
            destinos.addAll(elem.getDestinosFiltrados(filtro));
        }
        return destinos;
    }
}
