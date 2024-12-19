import java.net.StandardSocketOptions;
import java.sql.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //Hola gente, crear comentarios
        /*Para comentar codigo completo*/
        System.out.println("Hola gente!");

        String myString = "Esto es una cadena";
        myString = "Aqui cambio el valor de la cadena de texto";
        System.out.println(myString);

        int myInt = 7;
        myInt = myInt + 4;
        System.out.print(myInt);

        double myDouble = 6.5;
        System.out.println(myDouble);

        float myFloat = 6.5f;
        System.out.println(myFloat);

        System.out.println(myDouble + myFloat + myInt + myString);

        boolean myBoolean = true;
        myBoolean = false;
        System.out.println(myBoolean);

        myFloat = null;
        if (null != null) {
            System.out.println(myFloat + 18);
            System.out.println("My floar es distinto de nulo");
        } else {
            System.out.println("My float es nulo");
        }

    }
}