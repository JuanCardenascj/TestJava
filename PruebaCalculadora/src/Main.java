import java.util.Scanner; //IMPORTA LA CLASE SCANNER

public class Main {
    public static void main(String[] args) {

        //SE CREA EL OBJETO SCANNER PARA LEER LA ENTRADA DEL USUARIO
        Scanner scanner = new Scanner(System.in);

        //MUESTRA UN MENSAJE PARA QUE EL USUARIO ELIJA UNA OPERACIÓN!
        System.out.println("Calculadora Cárdenas Jiménez");
        System.out.println("Seleccione una operación que deses impartir");
        System.out.println("1.! Sumar +");
        System.out.println("2.! Restar -");
        System.out.println("2.! Multiplicar *");
        System.out.println("3.! Dividir /");

        // Leemos la opción seleccionada por el usuario
        int operacion = scanner.nextInt();

        // Pedimos al usuario los dos números
        System.out.print("Introduce el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();

        // Variable para almacenar el resultado
        double resultado = 0;

        // Realizamos la operación según la opción seleccionada
        switch (operacion) {
            case 1: // Sumar
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 2: // Restar
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 3: // Multiplicar
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 4: // Dividir
                // Verificamos si el segundo número es cero
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                }
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }

        // Cerramos el scanner
        scanner.close();
    }
}