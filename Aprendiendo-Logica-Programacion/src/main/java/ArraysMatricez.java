public class ArraysMatricez {
    public static void main(String[] args){

        String myArray[];

        myArray = new String[1000];
        myArray[0] = "JuanDavid";
        myArray[1] = "Miguel";
        myArray[2] = "David";
        myArray[3] = "Juna";

        //Matriz doble Array
        String myMatrix[][] = {
                {"Pedro", "Madrid"},
                {"David", "Barcelona"},
                {"Miguel", "Roma"},
        } ;

        myMatrix[2][1] = "Colombia";
    }
}
