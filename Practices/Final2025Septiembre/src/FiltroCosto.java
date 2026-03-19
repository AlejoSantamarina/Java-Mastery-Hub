public class FiltroCosto implements Filtro {
    private double costo;

    public FiltroCosto(double costo) {
        this.costo = costo;
    }

    public boolean cumple(Destino destino) {
        if(destino.getCostoBase() < costo) {
            return true;
        }
        return false;
    }
}
