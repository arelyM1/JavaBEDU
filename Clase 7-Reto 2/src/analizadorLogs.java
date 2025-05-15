import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class analizadorLogs {

    public static void main(String[] args) {
        Path rutaLogs = Paths.get("errores.log");
        int totalLineas = 0;
        int totalErrores = 0;
        int totalWarnings = 0;

        //Lectura eficiente con try-with-resources
        try (BufferedReader lector = new BufferedReader(new FileReader(rutaLogs.toFile()))) {
            String linea;

            while ((linea = lector.readLine()) != null) {
                totalLineas++;

                if (linea.contains("ERROR")) {
                    totalErrores++;
                }
                if (linea.contains("WARNING")) {
                    totalWarnings++;
                }
            }

            //Mostrar resumen
            System.out.println("✅ Análisis completado");
            System.out.println("Total de líneas leídas: " + totalLineas);
            System.out.println("Cantidad de errores: " + totalErrores);
            System.out.println("Cantidad de advertencias: " + totalWarnings);

            double porcentajeErrores = (totalErrores * 100.0) / totalLineas;
            double porcentajeWarnings = (totalWarnings * 100.0) / totalLineas;

            System.out.printf("Porcentaje de líneas con errores: %.2f%%\n", porcentajeErrores);
            System.out.printf("Porcentaje de líneas con advertencias: %.2f%%\n", porcentajeWarnings);

        } catch (IOException e) {
            //Guardar el error en registro_fallos.txt
            guardarErrorEnRegistro(e.getMessage());
            System.out.println("❌ Error al leer el archivo. Revisa registro_fallos.txt");
        }
    }

    private static void guardarErrorEnRegistro(String mensaje) {
        Path rutaRegistro = Paths.get("registro_fallos.txt");

        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(rutaRegistro.toFile(), true))) {
            escritor.write("Se produjo un error: " + mensaje);
            escritor.newLine();
        } catch (IOException e) {
            System.out.println("❌ Error al guardar en el archivo de fallos: " + e.getMessage());
        }
    }
}
