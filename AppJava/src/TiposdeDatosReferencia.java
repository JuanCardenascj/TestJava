public class TiposdeDatosReferencia {
    public static void TiposdeDatosReferencia(String[] args){
        /*TYPE OF DATA REFERENCE*/
        //THERE ARE ONLY 8 TYPES OF DATA
        String text = "Hey People!"; //V.TYPE OF DATA STRING TEXT

        //METODOS
        int largo = text.length();
        System.out.println(largo);

        String texto = text.replace("Hey", "Bye People!");
        System.out.println(text);

        //CALL METODOS DIRECTAMENTE EN EL SYOUT O SOUT
        System.out.println(texto.endsWith("ople!"));//DEVUELVE TRUE OR FALSE
        System.out.println(texto.startsWith("ey"));//DEVUELVE TRU OR FALSE
        System.out.println(texto.contains("ople!"));//STRING CONTIENE O NO UNA CADENA DE TEXTO
        System.out.println(texto.indexOf("ey"));//DEFINE DONDE SE ENCUENTRA EL TEXTO

        System.out.println(texto.toUpperCase());//TOMA EL TEXTO Y LO PASA A MAYUSCULAS
        System.out.println(texto.toLowerCase());//TOMA EL TEXTO Y LO PASA A MINUSCULA

        /*METODO TRIM*/
        String devil = " pig happy ";
        System.out.println(devil.trim());//ELIMINA LOS ESPACIOS QUE SE ENCUENTRAN AL COMIENZO Y AL FINAL DEL STRING
        System.out.println(devil);//MUESTRA EL TEXTO CON LOS ESPACIOS ESCRITOS DEL COMIENZO AL FINAL

    }
}
