package EjerciciciosIniciales;

/**
 * Comprobacion de igualdad de caracteres
 */

import java.util.Scanner;

public class CaracteresIguales {

    public static void main (String [] args){

        char a;
        char b;
        Scanner sc = new Scanner(System.in);

        System.out.println("========================");
        System.out.print("Escribe tu primer caracter primero: ");
        a=sc.next().charAt(0);
        System.out.print("Escribe tu segundo caracter segundo: ");
        b=sc.next().charAt(0);

        if(a==b){

            System.out.println("Ambos caracteres son iguales");
        } else {

            System.out.println("Los caracteres son distintos");
        }
    }
}
