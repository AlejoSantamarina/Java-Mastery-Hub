public class CHabilidad implements Condicion {
    private String habilidad;
    public boolean cumple(HeroeVolatil heroeVolatil) {
        return (heroeVolatil.listaHabilidades.contains(habilidad));
    }
}
