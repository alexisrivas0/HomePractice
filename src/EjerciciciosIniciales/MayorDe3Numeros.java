package EjerciciciosIniciales;

import java.util.Scanner;

/**
 * Calcule el mayor de tres numeros enteros
 *
 */

public class MayorDe3Numeros {

    public static void main (String [] args){

        int a;
        int b;
        int c;
        Scanner sc = new Scanner(System.in);

        System.out.println("=========================");
        System.out.print("Escribe tu primer numero: ");
        a=sc.nextInt();
        System.out.println("Escribe tu segundo numero: ");
        b=sc.nextInt();
        System.out.println("Escribe tu tercer numero: ");
        c=sc.nextInt();

        if(a>b&&a>c){
            System.out.println("El numero "+a+" es el numero mayor");
        }
        else if(b>a&&b>c){
            System.out.println("El numero "+b+" es el numero mayor");
        }
        else if(c>a&&c>b){
            System.out.println("El numero "+c+" es el numero mayor");
        }
        System.out.println("hasta luego");
    }

}
