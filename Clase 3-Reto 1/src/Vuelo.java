public class Vuelo {
    //Atributos
    private final String codigoVuelo;
    private String destino;
    private String horaSalida;
    private Pasajero asientoReservado;
    //Constructor
    public Vuelo(String codigo, String destino, String horaSalida) {
        this.codigoVuelo = codigo;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.asientoReservado = null;
    }
    //Metodos
    public boolean reservarAsiento(Pasajero p) {
        if (asientoReservado == null) {
            asientoReservado = p;
            return true;
        }
        return false;
    }

    public boolean reservarAsiento(String nombre, String pasaporte) {
        return reservarAsiento(new Pasajero(nombre, pasaporte));
    }

    public void cancelarReserva() {
        asientoReservado = null;
    }

    public String obtenerItinerario() {
        String info = "✈️ Itinerario del vuelo:\n" +
                "Código: " + codigoVuelo + "\n" +
                "Destino: " + destino + "\n" +
                "Salida: " + horaSalida + "\n";
        if (asientoReservado != null) {
            info += "Pasajero: " + asientoReservado.getNombre();
        } else {
            info += "Pasajero: [Sin reserva]";
        }
        return info;
    }
}