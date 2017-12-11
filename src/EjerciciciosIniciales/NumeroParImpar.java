package EjerciciciosIniciales;

import java.util.Scanner;

/**
 *
 * Escribe un programa para que calcule si un numero es par o impar
 *
 */

public class NumeroParImpar {

    public static void main (String [] args){

        int x;
        int calculo;

        Scanner sc = new Scanner(System.in);

        System.out.println("==================");
        System.out.print("Escribe tu numero: ");

        x = sc.nextInt();
        calculo = x%2;

        if (calculo ==0){

            System.out.println("Tu numero es par");

        } else{

            System.out.println("Tu numero es impar");
        }
        

    }
}