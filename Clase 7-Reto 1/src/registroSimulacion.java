import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class registroSimulacion {

    public static void main(String[] args) {
        Path rutaArchivo = Paths.get("config/parametros.txt");

        guardarParametros(rutaArchivo);

        if (Files.exists(rutaArchivo)) {
            System.out.println("✅ El archivo fue creado correctamente.\n");
            leerParametros(rutaArchivo);
        } else {
            System.out.println("❌ Error: El archivo no fue creado.");
        }
    }

    private static void guardarParametros(Path ruta) {
        try {
            // Crear carpeta si no existe
            if (!Files.exists(ruta.getParent())) {
                Files.createDirectories(ruta.getParent());
            }

            String contenido = """
                Tiempo de ciclo: 55.8 segundos
                Velocidad de línea: 1.2 m/s
                Número de estaciones: 8
                """;

            Files.write(ruta, contenido.getBytes());
            System.out.println("📁 Parámetros guardados en: " + ruta.toString());

        } catch (IOException e) {
            System.out.println("❌ Error al guardar los parámetros: " + e.getMessage());
        }
    }

    private static void leerParametros(Path ruta) {
        try {
            String contenido = Files.readString(ruta);
            System.out.println("📄 Contenido del archivo:\n" + contenido);

        } catch (IOException e) {
            System.out.println("❌ Error al leer el archivo: " + e.getMessage());
        }
    }
}
