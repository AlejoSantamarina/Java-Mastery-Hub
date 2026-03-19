public class FiltroID implements Filtro {
    private int id;

    public FiltroID(int id) {
        this.id = id;
    }

    public boolean cumple(Elemento elemento) {
        if(elemento.getId() == id) {
            return true;
        }
        return false;
    }
}
