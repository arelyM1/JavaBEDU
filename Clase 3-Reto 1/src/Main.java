public class Main {
    public static void main(String[] args) {
        Pasajero pasajero1 = new Pasajero("Claudia Zuñiga", "P123456");
        Vuelo vuelo = new Vuelo("UX123", "París", "14:30");

        //Reservar asiento
        if (vuelo.reservarAsiento(pasajero1)) {
            System.out.println("✅ Reserva realizada con éxito.\n");
        }

        //Mostrar itinerario
        System.out.println(vuelo.obtenerItinerario() + "\n");

        //Cancelar reserva
        System.out.println("❌ Cancelando reserva...\n");
        vuelo.cancelarReserva();

        //Mostrar itinerario nuevamente
        System.out.println(vuelo.obtenerItinerario() + "\n");

        //Reservar con datos directos
        vuelo.reservarAsiento("Montserrat Fuentes", "P654321");

        //Mostrar itinerario final
        System.out.println(vuelo.obtenerItinerario());
    }
}