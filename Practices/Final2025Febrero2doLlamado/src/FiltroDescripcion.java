public class FiltroDescripcion implements Filtro {
    private String palabra;

    public FiltroDescripcion(String palabra) {
        this.palabra = palabra;
    }

    public boolean cumple(Elemento elemento) {
        if(elemento.getDescripcion().contains(palabra)) {
            return true;
        }
        return false;
    }
}
