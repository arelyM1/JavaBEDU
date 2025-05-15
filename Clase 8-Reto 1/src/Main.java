public class Main {
    public static void main(String[] args) {
        //Inyección de dependencias
        GestorDialogo gestorDialogo = new DialogoTexto();
        LogicaDecision logicaDecision = new DecisionBinaria();
        TransicionHistoria transicion = new TransicionSimple();

        //Simulacion
        gestorDialogo.mostrarDialogo("Te encuentras en una encrucijada misteriosa...");
        gestorDialogo.mostrarDialogo("¿Quieres ir al bosque encantado (A) o al castillo oscuro (B)?");

        String decision = logicaDecision.obtenerDecisionJugador();

        gestorDialogo.mostrarDialogo("Has elegido la opción: " + decision);
        transicion.cambiarEscena(decision);
    }
}
