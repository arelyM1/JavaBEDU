import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MonitorCPU {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Double> consumos = new HashSet<>();

        System.out.println("🔍 Monitoreo de Consumo de CPU");
        System.out.println("Ingresa valores de CPU para cada servidor (porcentaje). Escribe 'fin' para terminar.");

        try {
            while (true) {
                System.out.print("👉 Ingreso: ");
                String entrada = scanner.nextLine().trim();

                if (entrada.equalsIgnoreCase("fin")) {
                    break;
                }

                double consumo;

                try {
                    consumo = Double.parseDouble(entrada);
                } catch (NumberFormatException e) {
                    System.out.println("❌ Error: Ingresa un valor numérico válido.");
                    continue;
                }

                if (consumo < 0 || consumo > 100) {
                    System.out.println("⚠️ Valor fuera de rango (0% - 100%).");
                    continue;
                }

                if (consumos.contains(consumo)) {
                    System.out.println("🔁 Valor duplicado, ya ha sido registrado.");
                    continue;
                }

                if (consumo > 95) {
                    throw new ConsumoCriticoException("🔥 Consumo crítico detectado: " + consumo + "%");
                }

                consumos.add(consumo);
                System.out.println("✅ Registro aceptado.");
            }

            System.out.println("\n📊 Resumen del monitoreo:");
            for (Double c : consumos) {
                System.out.println("🖥️ CPU: " + c + "%");
            }

        } catch (ConsumoCriticoException e) {
            System.out.println("🚨 ALERTA: " + e.getMessage());

        } finally {
            scanner.close();
            System.out.println("🔚 Monitoreo finalizado. Recursos liberados.");
        }
    }
}
