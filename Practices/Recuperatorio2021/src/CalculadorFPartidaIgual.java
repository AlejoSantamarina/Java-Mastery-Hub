public class CalculadorFPartidaIgual implements Calculador {
    public boolean cumple(ContingenteEspecial c, ElementoUnidad e) {
        return c.getFechaDePartida().equals(e.getFechaDePartida());
    }
}
