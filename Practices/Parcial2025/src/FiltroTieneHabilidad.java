public class FiltroTieneHabilidad implements Filtro {
    private String habilidad;

    public FiltroTieneHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public boolean cumple(Poni poni) {
        if(poni.getHabilidades().contains(habilidad)) {
            return true;
        }
        return false;
    }
}
