import java.util.Optional;

public class Factura {
    //Atributos
    private double monto;
    private String descripcion;
    private Optional<String> rfc;
    //Constructor
    public Factura(double monto, String descripcion, String rfc) {
        this.monto = monto;
        this.descripcion = descripcion;
        this.rfc = (rfc != null) ? Optional.of(rfc) : Optional.empty();
    }
    //Get
    public String getResumen() {
        String resumen = "📄 Factura generada:\n" +
                "Descripción: " + descripcion + "\n" +
                "Monto: $" + monto + "\n";

        resumen += "RFC: " + rfc.orElse("[No proporcionado]");
        return resumen;
    }
}