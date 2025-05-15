public class Entrada {
    //Atributos de entrada
    String nombreEvento;
    Double precioEntrada;

    //Constructor
    public Entrada(String nombreEvento, Double precioEntrada) {
        this.nombreEvento = nombreEvento;
        this.precioEntrada = precioEntrada;
    }

    //Metodos
    public void mostrarEntrada() {
        System.out.printf("🎟️ Evento:" + nombreEvento + " | 🤑 Precio: " + precioEntrada + " \n");
    }

}
