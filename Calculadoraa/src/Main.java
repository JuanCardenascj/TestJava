import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //1
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));/*JOPTION muestra un cuadro de dialogo*/
        //3
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));

        /*MENU*/
        String menu = "1: suma \n2:Resta \nMultiplicacion \n4:Division \n5:Salir";

        /*LA ELECCION DEL USUARIO*/
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

        switch (opcion) { //EVALUA DIFERENTES SITUACIONES
            case 1:
                JOptionPane.showMessageDialog(null, "La suma es: " + (num1 + num2));
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "La resta es: " + (num1 - num2));
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "La multiplicacion es: " + (num1 * num2));
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "La division es: " + (num1 / num2));
                break;
            default:
                JOptionPane.showMessageDialog(null, "La opcion no existe");
                break;
        }
    }
}