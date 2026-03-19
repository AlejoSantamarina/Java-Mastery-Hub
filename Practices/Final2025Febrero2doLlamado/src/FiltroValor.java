public class FiltroValor implements Filtro {
    private double valor;

    public FiltroValor(double valor) {
        this.valor = valor;
    }

    public boolean cumple(Elemento elemento) {
        if(elemento.getValor() < valor) {
            return true;
        }
        return false;
    }
}
