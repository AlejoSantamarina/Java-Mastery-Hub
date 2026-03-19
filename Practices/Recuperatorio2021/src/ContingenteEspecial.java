import java.time.LocalDate;

public class ContingenteEspecial extends Contingente {
    private Calculador calculador;

    public ContingenteEspecial(String nombre, String destino, LocalDate fechaDePartida, LocalDate fechaDeRegreso, Calculador calculador) {
        super(nombre, destino, fechaDePartida, fechaDeRegreso);
        this.calculador = calculador;
    }

    public void addElemento(ElementoUnidad elemento) {
        if(calculador.cumple(this, elemento)) {
            elementos.add(elemento);
        }
    }
}
