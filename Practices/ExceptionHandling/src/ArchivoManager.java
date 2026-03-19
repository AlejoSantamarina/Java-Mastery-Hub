import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ArchivoManager {
    private String rutaArchivo;
    private File archivo;

    public ArchivoManager(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
        archivo = new File(rutaArchivo);
    }

    public void agregarProducto(Producto producto) {
        if(!Files.exists(Paths.get(rutaArchivo))) {
            System.out.println("El archivo " + rutaArchivo + " no existe");
            return;
        }

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo))) {
            String linea = producto.getNombre() + ";" + producto.getCantidad() + ";" + producto.getPrecio();
            bw.write(linea);
            bw.newLine();
            System.out.println("Información agregada correctamente");

        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public File getArchivo() {
        return archivo;
    }
}
