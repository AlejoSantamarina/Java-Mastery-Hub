public class CondicionNivelExperiencia implements Condicion {
    private int nivelExperienciaMayorA;

    public CondicionNivelExperiencia(int nivelExperienciaMayorA) {
        this.nivelExperienciaMayorA = nivelExperienciaMayorA;
    }

    public boolean cumple(Unidad u) {
        return u.getNivelExperiencia() > nivelExperienciaMayorA;
    }
}
