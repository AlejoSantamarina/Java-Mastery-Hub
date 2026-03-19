public class Libro implements Comparable<Libro> {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public int compareTo(Libro libro) { //Devuelve negativo si this va primero y positivo si this va despues.
        return Integer.compare(this.anioPublicacion, libro.anioPublicacion); //Forma ascendente.
        //Recordar que es similar a this.anioPublicacion - libro.anioPublicacion;
    }

    //return Integer.compare(libro.anioPublicacion, this.anioPublicacion); seria para forma descendente.
    //Recordar que es similar a libro.anioPublicacion - this.anioPublicacion;

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }
}
