import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Creamos un objeto Random para generar un número aleatorio
        Random random = new Random();

        // Generamos un número aleatorio entre 1 y 100
        int numeroSecreto = random.nextInt(100) + 1;

        // Variable para almacenar el número que ingresa el usuario
        int intento = 0;

        // Variable para contar los intentos
        int contadorIntentos = 0;

        // Mostramos instrucciones al usuario
        System.out.println("¡Bienvenido al juego de Adivina el Número!");
        System.out.println("He generado un número entre 1 y 100. ¡Intenta adivinarlo!");

        // Usamos un bucle while para seguir pidiendo al usuario hasta que adivine el número
        while (intento != numeroSecreto) {
            System.out.print("Introduce tu intento: ");
            intento = scanner.nextInt();  // Leemos el número ingresado por el usuario

            // Aumentamos el contador de intentos
            contadorIntentos++;

            // Comprobamos si el intento es mayor, menor o igual al número secreto
            if (intento < numeroSecreto) {
                System.out.println("¡El número es más alto!");
            } else if (intento > numeroSecreto) {
                System.out.println("¡El número es más bajo!");
            } else {
                System.out.println("¡Felicidades! Adivinaste el número en " + contadorIntentos + " intentos.");
            }
        }

        // Cerramos el scanner para liberar recursos
        scanner.close();
    }
}