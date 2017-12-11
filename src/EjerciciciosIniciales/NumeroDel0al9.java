package EjerciciciosIniciales;

import java.util.Scanner;

public class NumeroDel0al9 {

    public static void main (String[] args){

        int x;
        int y;
        Scanner sc = new Scanner(System.in);

        System.out.println("===============================");
        System.out.print("Escribe tu numero: ");
        x=sc.nextInt();

        if(x>=0&&x<=10){

            System.out.println("Tu numero pertenece al conjunto del cero al diez");
        } else {

            System.out.println("Tu numero NO pertence al conjunto del cero al diez");
        }
        System.out.println("¡Hasta luego!");
    }
}
