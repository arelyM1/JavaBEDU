
public class Main {
    public static void main(String[] args) {
    Entrada entrada1 = new Entrada("MineCraft", 100.0);
    Entrada entrada2 = new Entrada("SMTR25", 2500.50);
    entrada1.mostrarEntrada();
    entrada2.mostrarEntrada();

    //Objeto creado con Record
        EntradaRecord entradaRecord1= new EntradaRecord("Family by Choice", 250.37);
        //Record
        System.out.println("Muestra de corrida con Record: ");
        //Muestra el toString() generado automáticamente por el record.
        System.out.println(entradaRecord1);
    }
}