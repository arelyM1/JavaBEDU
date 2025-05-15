import java.util.Scanner;

public class DecisionBinaria implements LogicaDecision {
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public String obtenerDecisionJugador() {
        System.out.print("👉 Elige una opción (A/B): ");
        return scanner.nextLine().trim().toUpperCase();
    }
}
