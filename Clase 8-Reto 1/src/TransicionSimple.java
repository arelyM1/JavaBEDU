public class TransicionSimple implements TransicionHistoria {
    @Override
    public void cambiarEscena(String decision) {
        if (decision.equalsIgnoreCase("A")) {
            System.out.println("🔁 Transición a la escena del bosque encantado...");
        } else {
            System.out.println("🔁 Transición a la escena del castillo oscuro...");
        }
    }
}
