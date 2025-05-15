public class Main {
    public static void main(String[] args) {
        Ambulancia ambulancia = new Ambulancia("Ambulancia", "Juan");
        Patrulla patrulla = new Patrulla("Patrulla", "Laura");
        UnidadBomberos bomberos = new UnidadBomberos("UnidadBomberos", "Marco");

        ambulancia.iniciarOperacion();
        patrulla.iniciarOperacion();
        bomberos.iniciarOperacion();
    }
}