public class Conversiones {
    public static void conversiones(String[] args) {
        /*CONVERSION DE TIPOS IMPLICITA*/
        //CREAR UNA SUMA DE ESTOS DOS VALORES DE DISTANTAS VARIABLES
        byte a = 1;
        int b = 15;
        double c = 15.15;
        float d = 15f;
        long e = 'a';
        /*SE CREA UNA NUEVA VARIABLE*/
        double f = a + b + c + d + e;
        System.out.println(e);

        /*CONVERSION EXPLICITA*/
        int x = 15;
        double y = 15.015;
        int z = (int) (x + y); //FORMA EN LA QUE REALICE LA OPERACION SIN IMPORTAR DECIMLAS
        System.out.println(z);

        /*CONVERSION EXPLICITA DE TIPO DE DATO STRING*/
        String j = "1.1";
        int k = 5;
        double l = Double.parseDouble(j) + k; //ESCOGE LA CLASE LIBRERIA PARSE DOUBLE
        System.out.println(l);
    }
}
