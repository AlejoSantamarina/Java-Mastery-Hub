import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String apellido;
    private ArrayList<Destino> destinosVisitados;
    private Filtro filtro;

    public Cliente(String nombre, String apellido, Filtro filtro) {
        this.nombre = nombre;
        this.apellido = apellido;
        destinosVisitados = new ArrayList<>();
        this.filtro = filtro;
    }

    public boolean estaInteresado(Destino destino) {
        for(Destino d : destinosVisitados) {
            if(destino.equals(d)) {
                return false;
            }
        }
        return true;
    }

    public Filtro getFiltro() {
        return filtro;
    }
}
