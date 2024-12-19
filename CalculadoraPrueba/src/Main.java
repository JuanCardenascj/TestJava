import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Scanner Prueba Vacaciones
        Scanner scanner = new Scanner(System.in);//CREA EL OBJETO SCANNER
        System.out.println("\uD83E\uDD16 Bienvenido a su Porsche \uD83E\uDD16.!");
        System.out.println("Digite su nombre ✅");
        String nombre = scanner.nextLine(); //LEE UNA LÍNEA DE TEXTO
        System.out.println("Digirte su apellido ✅");
        String apellido = scanner.nextLine(); //LEE UNA LÍNEA DE TEXTO
        System.out.println("Hola, " + nombre + apellido + "!");
        //Cordialidad
        System.out.println("¿Como estas el dia de hoy?");
        String comoestas = scanner.nextLine();
        System.out.println("Me algro que estes, " + comoestas + "!");



        scanner.close();
    }
}