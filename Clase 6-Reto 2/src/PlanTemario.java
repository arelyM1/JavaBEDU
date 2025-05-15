import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Comparator;
public class PlanTemario {
    public static void main(String[] args) {
        //lista segura para temas activos (puede modificarse sin errores en concurrencia)
        CopyOnWriteArrayList<Tema> temas = new CopyOnWriteArrayList<>();

        //agregamos algunos temas de ejemplo
        temas.add(new Tema("📘Lectura comprensiva", 2));
        temas.add(new Tema("📕Matemáticas básicas", 1));
        temas.add(new Tema("📙Cuidado del medio ambiente", 3));
        temas.add(new Tema("📒Historia universal", 2));

        //mapa concurrente para recursos compartidos por título del tema
        ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();
        recursos.put("🔧Lectura comprensiva", "https://recursos.edu/lectura");
        recursos.put("🔧Matemáticas básicas", "https://recursos.edu/mate");
        recursos.put("🔧Cuidado del medio ambiente", "https://recursos.edu/medioambiente");
        recursos.put("🔧Historia universal", "https://recursos.edu/historia");

        //muestra los temas ordenados alfabéticamente (Comparable)
        Collections.sort(temas);
        System.out.println("📚 Temas ordenados alfabéticamente:");
        for (Tema t : temas) {
            System.out.println(t);
        }

        //Ordenar temas por prioridad (Comparator)
        temas.sort(Comparator.comparingInt(Tema::getPrioridad));
        System.out.println("\n🚦 Temas ordenados por prioridad:");
        for (Tema t : temas) {
            System.out.println(t);
        }

        //Muestra el repositorio de recursos
        System.out.println("\n🔗 Recursos compartidos por tema:");
        for (String titulo : recursos.keySet()) {
            System.out.println(titulo + " → " + recursos.get(titulo));
        }
    }
}