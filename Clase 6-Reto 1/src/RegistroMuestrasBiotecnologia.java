import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Scanner;

public class RegistroMuestrasBiotecnologia {
    public static void main(String[] args) {
        //Paso 1: ArrayList para registrar todas las especies en orden de llegada
        ArrayList<String> listaMuestras = new ArrayList<>();
        listaMuestras.add("Homo sapiens");
        listaMuestras.add("Mus musculus");
        listaMuestras.add("Arabidopsis thaliana");
        listaMuestras.add("Homo sapiens"); // muestra repetida (replicada)

        //Paso 2: HashSet para identificar especies únicas (no se repiten)
        HashSet<String> especiesUnicas = new HashSet<>(listaMuestras);

        //Paso 3: HashMap para asociar ID de muestra con nombre del investigador
        HashMap<String, String> mapaMuestrasInvestigador = new HashMap<>();
        mapaMuestrasInvestigador.put("M-001", "Dra. Fuentes");
        mapaMuestrasInvestigador.put("M-002", "Dr. Zuñiga");
        mapaMuestrasInvestigador.put("M-003", "Mtra. Leon");
        mapaMuestrasInvestigador.put("M-004", "Dra. Claudia");

        //Paso 4: Mostrar resultados
        System.out.println("🧾 Lista de todas las muestras registradas (orden de llegada):");
        for (String muestra : listaMuestras) {
            System.out.println("• " + muestra);
        }

        System.out.println("\n🧬 Especies únicas procesadas:");
        for (String especie : especiesUnicas) {
            System.out.println("• " + especie);
        }

        System.out.println("\n🔍 Relación ID de muestra → Investigador responsable:");
        for (String id : mapaMuestrasInvestigador.keySet()) {
            String investigador = mapaMuestrasInvestigador.get(id);
            System.out.println(id + " → " + investigador);
        }

        //Busqueda por ID de muestra
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n🔎 Ingresa el ID de la muestra para buscar al investigador (ej: M-002): ");
        String idBuscado = scanner.nextLine();

        if (mapaMuestrasInvestigador.containsKey(idBuscado)) {
            System.out.println("🧑‍🔬 Investigador responsable: " + mapaMuestrasInvestigador.get(idBuscado));
        } else {
            System.out.println("⚠️ ID de muestra no encontrado...");
        }

        scanner.close();
    }
}
