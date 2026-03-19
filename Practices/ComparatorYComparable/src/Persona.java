public class Persona implements Comparable<Persona> {
    private String nombre;
    private int edad;
    private double altura;

    public Persona(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public double getAltura() {
        return altura;
    }

    public int compareTo(Persona o) {
        return Integer.compare(this.edad, o.edad);
    }
}
