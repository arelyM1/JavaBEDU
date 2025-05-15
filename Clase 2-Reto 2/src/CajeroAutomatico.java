import java.util.Scanner;

public class CajeroAutomatico {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        var saldo = 1000.0;
        int opcion;

        do {
            System.out.println("******Bienvenido al cajero automático******");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("💰 Tu saldo actual es: $" + saldo);
                    break;

                case 2:
                    System.out.print("Ingresa el monto a depositar: ");
                    double deposito = entrada.nextDouble();
                    saldo += deposito;
                    System.out.println("✅ Depósito exitoso. Nuevo saldo: $" + saldo);
                    break;

                case 3:
                    System.out.print("Ingresa el monto a retirar: ");
                    double retiro = entrada.nextDouble();

                    if (retiro > saldo) {
                        System.out.println("⚠️ Saldo insuficiente. Tu saldo es: $" + saldo);
                        continue; //vuelve al menú sin hacer nada más
                    }

                    saldo -= retiro;
                    System.out.println("✅ Retiro exitoso. Nuevo saldo: $" + saldo);
                    break;

                case 4:
                    System.out.println("👋 Gracias por usar el cajero automático. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("❌ Opción inválida. Intenta de nuevo.");
                    continue; //vuelve al menú sin hacer nada más
            }

        } while (opcion != 4);

        entrada.close();
    }
}