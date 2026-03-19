public class FiltroGuia implements Filtro {
    private String guia;

    public FiltroGuia(String guia) {
        this.guia = guia;
    }

    public boolean cumple(Destino destino) {
        return guia.equals(destino.getGuia());
    }
}
