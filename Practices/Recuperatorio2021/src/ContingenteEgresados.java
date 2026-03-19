import java.time.LocalDate;

public class ContingenteEgresados extends Contingente {

    public ContingenteEgresados(String nombre, String destino, LocalDate fechaDePartida, LocalDate fechaDeRegreso) {
        super(nombre, destino, fechaDePartida, fechaDeRegreso);
    }

    public void addElemento(ElementoUnidad e) {
        if(e.getDestino().equals("Bariloche")) {
            elementos.add(e);
        }
    }
}
