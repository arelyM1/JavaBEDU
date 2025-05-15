import java.util.Scanner;

public class SimuladorFarmacia {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Solicita datos al usuario
        System.out.print("💉Nombre del medicamento: ");
        String nombreMedicamento = entrada.nextLine();

        System.out.print("🤑 Precio unitario: ");
        double precioUnitario = entrada.nextDouble();

        System.out.print("📝 Cantidad de piezas: ");
        int cantidad = entrada.nextInt();

        //Cálculos
        var totalSinDescuento = precioUnitario * cantidad;
        boolean aplicaDescuento = totalSinDescuento > 500;
        double descuento = aplicaDescuento ? totalSinDescuento * 0.15 : 0.0;
        double totalAPagar = totalSinDescuento - descuento;

        //Mostrar resumen
        System.out.println("\nResumen de compra:");
        System.out.println("💉 Medicamento: " + nombreMedicamento);
        System.out.println("📝 Cantidad: " + cantidad);
        System.out.println("🤑 Precio unitario: $" + precioUnitario);
        System.out.println("💵 Total sin descuento: $" + totalSinDescuento);
        System.out.println("¿Aplica descuento?: " + aplicaDescuento);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + totalAPagar);

        entrada.close();
    }
}