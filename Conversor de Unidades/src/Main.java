import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creamos el objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Mostramos las opciones de conversión al usuario
        System.out.println("Conversor de Unidades");
        System.out.println("Selecciona la conversión que deseas realizar:");
        System.out.println("1. Kilómetros a Millas");
        System.out.println("2. Celsius a Fahrenheit");
        System.out.println("3. Metros a Pulgadas");
        System.out.println("4. Litros a Galones");
        System.out.print("Elige una opción (1-4): ");

        // Leemos la opción seleccionada por el usuario
        int opcion = scanner.nextInt();

        // Variable para el resultado de la conversión
        double resultado;

        // Dependiendo de la opción seleccionada, realizamos la conversión
        switch (opcion) {
            case 1:  // Kilómetros a Millas
                System.out.print("Introduce los kilómetros: ");
                double km = scanner.nextDouble();
                resultado = km * 0.621371;  // 1 km = 0.621371 millas
                System.out.println(km + " kilómetros equivalen a " + resultado + " millas.");
                break;

            case 2:  // Celsius a Fahrenheit
                System.out.print("Introduce los grados Celsius: ");
                double celsius = scanner.nextDouble();
                resultado = (celsius * 9/5) + 32;  // Fórmula de Celsius a Fahrenheit
                System.out.println(celsius + " grados Celsius equivalen a " + resultado + " grados Fahrenheit.");
                break;

            case 3:  // Metros a Pulgadas
                System.out.print("Introduce los metros: ");
                double metros = scanner.nextDouble();
                resultado = metros * 39.3701;  // 1 metro = 39.3701 pulgadas
                System.out.println(metros + " metros equivalen a " + resultado + " pulgadas.");
                break;

            case 4:  // Litros a Galones
                System.out.print("Introduce los litros: ");
                double litros = scanner.nextDouble();
                resultado = litros * 0.264172;  // 1 litro = 0.264172 galones
                System.out.println(litros + " litros equivalen a " + resultado + " galones.");
                break;

            default:
                System.out.println("Opción no válida.");
                break;
        }

        // Cerramos el scanner para liberar recursos
        scanner.close();
    }
}