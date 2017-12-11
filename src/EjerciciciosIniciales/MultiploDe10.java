package EjerciciciosIniciales;

import java.util.Scanner;

/**
 * Este programa muestra si el numero introducido es multiplo de 10
 */

public class MultiploDe10 {

    public static void main (String[] args){

        int x;
        int resultado;
        Scanner sc = new Scanner(System.in);



        System.out.println("=========================================");
        System.out.print("introduce el numero que deseas comprobar: ");
        x = sc.nextInt();
        resultado = x%10;

        if (resultado == 0){

            System.out.println("Tu numero es multiplo de 10");
        }
        else {

            System.out.println("Tu numero no es multiplo de 10");
        }

    }
}
