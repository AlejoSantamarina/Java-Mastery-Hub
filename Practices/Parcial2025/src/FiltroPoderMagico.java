public class FiltroPoderMagico implements Filtro {
    private int minPoderMagico;

    public FiltroPoderMagico(int minPoderMagico) {
        this.minPoderMagico = minPoderMagico;
    }

    public boolean cumple(Poni poni) {
        if(poni.getPoderMagico() > minPoderMagico) {
            return true;
        }
        return false;
    }
}
