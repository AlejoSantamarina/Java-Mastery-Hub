import java.util.ArrayList;

public abstract class UnidadDeTrabajo extends Unidad {
    protected ArrayList<Unidad> unidades;

    public UnidadDeTrabajo(String nombre) {
        super(nombre);
        unidades = new ArrayList<>();
    }

    public abstract int getNivelExperiencia();
    public abstract double getPrecisionEnCampo();
    public abstract UnidadDeTrabajo crearInstancia();

    public ArrayList<String> getEspecializaciones() {
        ArrayList<String> especializaciones = new ArrayList<>();
        for(Unidad u : unidades) {
            ArrayList<String> espec = u.getEspecializaciones();
            for(String s : espec) {
                if(!especializaciones.contains(s)) {
                    especializaciones.add(s);
                }
            }
        }
        return especializaciones;
    }

    public Unidad copiarSiCumple(Condicion c) {
        UnidadDeTrabajo copia = crearInstancia();
        for(Unidad u : this.unidades) {
            Unidad copiaHijo = u.copiarSiCumple(c);
            if(copiaHijo != null) {
                copia.unidades.add(copiaHijo);
            }
        }
        if(copia.unidades.isEmpty()) {
            return null;
        }
        return copia;
    }
}
