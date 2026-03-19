public class FiltroBioma implements Filtro {
    private String bioma;

    public FiltroBioma(String bioma) {
        this.bioma = bioma;
    }

    public boolean cumple(Destino destino) {
        return bioma.equals(destino.getBioma());
    }
}
