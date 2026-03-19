import java.time.LocalDate;

public class ContingenteJubilados extends Contingente {

    public ContingenteJubilados(String nombre, String destino, LocalDate fechaDePartida, LocalDate fechaDeRegreso) {
        super(nombre, destino, fechaDePartida, fechaDeRegreso);
    }

    public double getPrecio() {
        double precio = 0;
        for(ElementoUnidad elemento : elementos) {
            precio += elemento.getPrecio();
        }
        int cantElementos = elementos.size();
        if(cantElementos > 0) {
            return precio/cantElementos;
        }
        return 0;
    }
}
