public class CalculadorDestinoIgual implements Calculador {

    public boolean cumple(ContingenteEspecial c, ElementoUnidad e) {
        return c.getDestino().equals(e.getDestino());
    }
}
