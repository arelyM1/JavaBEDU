//Clase Paciente
public class Paciente {
    //atributos
    String nombre;
    int edad;
    String numeroExpediente;

    //metodo
    public void mostrarInformacion(){
        System.out.println("📝 Nombre: " + nombre);
        System.out.println("🗓️ Edad: " + edad);
        System.out.println("📔 Numero de Expediente: " + numeroExpediente);
    }
}
