import java.util.Scanner;

public class Main { /*Pascalcase es una CLASS*/
    public static void main(String[] args) {/*calmCase es un OBJET*/

        Scanner scanner = new Scanner(System.in); //Scanner
        String input = ""; //Declarando variables para almacenar lo que escriba el usuario

        terminal: while (true) { //Instrucción y true para que se ejecute siempre
            System.out.println("Ingrese una opción");
            System.out.println("Calculadora");
            System.out.println("Hackear la nasa");
            System.out.println("Salir!");

            input = scanner.next().toLowerCase(); //Tomar o capturar lo que ingrese el usuario

            switch(input) {
                case "1":
                    System.out.println("Ingrese un número");
                    int a = scanner.nextInt();
                    System.out.println("Ingrese un segundo número");
                    int b = scanner.nextInt();
                    System.out.println("El resultado es:");
                    System.out.println(a + b);
                 break;
                case "2":
                    System.out.println("Hackeando la nasa :v");
                    System.out.println("te");
                    System.out.println("fuiste");
                    System.out.println("a la ");
                    System.out.println("verga");
                    break;
                case "3":
                    System.out.println("Chao Gente");
                    break terminal;
            }
        }

    }
}